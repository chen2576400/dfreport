package com.df.report.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.df.report.dao.MembershipLinkMapper;
import com.df.report.dao.PiresourceAssignmentMapper;
import com.df.report.dao.PiresourceMapper;
import com.df.report.model.*;
import com.df.report.service.PiplanActivityService;
import com.df.report.dao.PiplanActivityMapper;
import com.df.util.DateUtils;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author chenning
 * @description 针对表【piplan_activity】的数据库操作Service实现
 * @createDate 2022-04-20 16:14:33
 */
@Service
public class PiplanActivityServiceImpl extends MPJBaseServiceImpl<PiplanActivityMapper, PiplanActivity>
        implements PiplanActivityService {
    @Autowired
    PiplanActivityMapper piplanActivityMapper;
    @Autowired
    MembershipLinkMapper membershipLinkMapper;
    @Autowired
    PiresourceMapper piresourceMapper;
    @Autowired
    PiresourceAssignmentMapper piresourceAssignmentMapper;

    @Override
    public List<PiplanActivityVo> WorkDelayTable(String[] time, List<Integer> groupIds, String projectId, String planId) {
        Date startDate = DateUtils.getEndTime(DateUtils.getDate(System.currentTimeMillis(), 0, -3, 0, 0, 0, 0));
        Date endDate = DateUtils.getStartTime(System.currentTimeMillis());
        String startTime = DateUtils.format(startDate, "yyyy-MM-dd HH:mm:ss");
        String endTime = DateUtils.format(endDate, "yyyy-MM-dd HH:mm:ss");

        MPJLambdaWrapper<Object> wrapper1 = new MPJLambdaWrapper<>();
        wrapper1.selectAs(PiplanActivity::getId, "activityId")
                .selectAs(PiplanActivity::getName, "activityName")
                .selectAs(PiplanActivity::getTargetStartDate, "targetStartTime")
                .selectAs(PiplanActivity::getTargetEndDate, "byTime")
                .selectAs(StexpectedFinishTime::getExpectedFinishTime, "expectedFinishTime")
                .selectAs(PiplanActivity::getActualEndDate, "actualEndTime")
                .selectAs(PiplanActivity::getActualStartDate, "actualStartTime")
                .selectAs(Piproject::getProjectName, "projectName")
                .leftJoin(Piproject.class, Piproject::getId, PiplanActivity::getProjectRefId)
                .leftJoin(StexpectedFinishTime.class, StexpectedFinishTime::getPlanActivityRefId, PiplanActivity::getId)
                .eq(Objects.nonNull(projectId), PiplanActivity::getProjectRefId, projectId)
                .eq(Objects.nonNull(planId), PiplanActivity::getRootRefId, planId)
                .between(PiplanActivity::getTargetStartDate, startTime, endTime);
        List<Integer> reoourceIds = getPlannableIds(groupIds);
        if (CollectionUtils.isNotEmpty(reoourceIds)) {
            List<List<Integer>> partition = Lists.partition(reoourceIds, 900);
            for (List<Integer> integers : partition) {
                wrapper1.and(objectMPJLambdaWrapper -> objectMPJLambdaWrapper.or(objectMPJLambdaWrapper1 ->
                objectMPJLambdaWrapper1.in(PiplanActivity::getId, reoourceIds)));
            }
        }
        List<PiplanActivityVo> piplanActivityVos = piplanActivityMapper.selectJoinList(PiplanActivityVo.class, wrapper1);
        return piplanActivityVos;
    }


    private List<Integer> getPlannableIds(List<Integer> groupIds) {
        MPJLambdaWrapper<Object> wrapper2 = new MPJLambdaWrapper<>();
        wrapper2.select(MembershipLink::getRolebobjectId);
        wrapper2.leftJoin(Pigroup.class, Pigroup::getId, MembershipLink::getRoleaobjectId);
        if (CollectionUtils.isNotEmpty(groupIds)) {
            List<List<Integer>> partition = Lists.partition(groupIds, 900);
            for (List<Integer> integers : partition) {
                wrapper2.or(objectMPJLambdaWrapper -> objectMPJLambdaWrapper.in(Pigroup::getId, integers));
            }
        }
        wrapper2.groupBy(MembershipLink::getRolebobjectId);
        //MembershipLink  RolebobjectId 集合
        List<Integer> rolebobjectIds = membershipLinkMapper.selectJoinList(Integer.class, wrapper2);
        if (CollectionUtils.isEmpty(rolebobjectIds)) return null;


        MPJLambdaWrapper<Piresource> wrapper3 = new MPJLambdaWrapper();
        wrapper3.select(Piresource::getId);
        List<List<Integer>> partition1 = Lists.partition(rolebobjectIds, 900);
        for (List<Integer> integers : partition1) {
            wrapper3.or(lambdaQueryWrapper -> lambdaQueryWrapper.in(Piresource::getUserRefId, integers));
        }
        //reoourceIds
        List<Integer> reoourceIds = piresourceMapper.selectJoinList(Integer.class, wrapper3);


        MPJLambdaWrapper<Piresource> wrapper4 = new MPJLambdaWrapper();
        wrapper4.select(PiresourceAssignment::getPlannableRefId);
        if (CollectionUtils.isNotEmpty(reoourceIds)) {
            List<List<Integer>> partition = Lists.partition(reoourceIds, 900);
            for (List<Integer> integers : partition) {
                wrapper4.or(lambdaQueryWrapper -> lambdaQueryWrapper.in(PiresourceAssignment::getRsrcRefId, integers));
            }
        }
        //piresource_assignment.plannable_id 集
        List<Integer> assignmentRsrcIds = piresourceAssignmentMapper.selectJoinList(Integer.class, wrapper4);
        return assignmentRsrcIds;
    }
}




