package com.df.report.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.df.report.dao.MembershipLinkMapper;
import com.df.report.dao.PiresourceAssignmentMapper;
import com.df.report.dao.PiresourceMapper;
import com.df.report.model.*;
import com.df.report.service.*;
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
import java.util.function.Function;

/**
 * @author chenning
 * @description 针对表【piplan_activity】的数据库操作Service实现
 * @createDate 2022-04-20 16:14:33
 * <p>
 * 从集合数据中/和已经有查询条件中
 */
@Service
public class PiplanActivityServiceImpl extends MPJBaseServiceImpl<PiplanActivityMapper, PiplanActivity>
        implements PiplanActivityService {
    @Autowired
    PiplanActivityMapper piplanActivityMapper;
    @Autowired
    FunctionApply functionApply;
    @Autowired
    private MembershipLinkService membershipLinkService;
    @Autowired
    private PigroupService pigroupService;
    @Autowired
    private PiresourceService piresourceService;
    @Autowired
    private PiresourceAssignmentService piresourceAssignmentService;

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
        List<Integer> planActIds = functionApply.getPlanActIds(membershipLinkService::rolebobjectIds, piresourceService::resourceIds, piresourceAssignmentService::assignmentRsrcIds, groupIds);
        if (CollectionUtils.isNotEmpty(planActIds)) {
            List<List<Integer>> partition = Lists.partition(planActIds, 900);
            for (List<Integer> integers : partition) {
                wrapper1.and(objectMPJLambdaWrapper -> objectMPJLambdaWrapper.or(objectMPJLambdaWrapper1 ->
                        objectMPJLambdaWrapper1.in(PiplanActivity::getId, planActIds)));
            }
        }
        List<PiplanActivityVo> piplanActivityVos = piplanActivityMapper.selectJoinList(PiplanActivityVo.class, wrapper1);
        return piplanActivityVos;
    }


}




