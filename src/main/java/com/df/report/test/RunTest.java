package com.df.report.test;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.df.demon.model.Dfcvtrial;
import com.df.report.dao.MembershipLinkMapper;
import com.df.report.dao.PiresourceAssignmentMapper;
import com.df.report.dao.PiresourceMapper;
import com.df.report.model.*;
import com.df.report.service.PiplanActivityService;
import com.df.report.service.PiprojectService;
import com.df.report.service.StexpectedFinishTimeService;
import com.df.util.DateUtils;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.collect.Lists;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-20 16:00
 **/
@SpringBootTest
@Log4j2
public class RunTest {
    @Autowired
    private PiprojectService piprojectService;


    @Autowired
    private StexpectedFinishTimeService stexpectedFinishTimeService;


    @Autowired
    private PiplanActivityService piplanActivityService;


    @Autowired
    private PiresourceAssignmentMapper piresourceAssignmentMapper;

    @Autowired
    private PiresourceMapper piresourceMapper;


    @Autowired
    private MembershipLinkMapper membershipLinkMapper;


    @Test
    public void test1() {
        List<Piproject> list = piprojectService.list(Wrappers.<Piproject>lambdaQuery()
                .select(Piproject::getId)
        );
        System.out.println(list);
    }


    @Test
    public void test2() {
//        List<StexpectedFinishTime> list = stexpectedFinishTimeService.list(Wrappers.<StexpectedFinishTime>lambdaQuery()
//                .select(StexpectedFinishTime::getId)
//        );
        stexpectedFinishTimeService.selectJoinList(StexpectedFinishTime.class, new MPJLambdaWrapper<>()
                .select(StexpectedFinishTime::getId)
                .innerJoin(Piproject.class, Piproject::getId, StexpectedFinishTime::getId)
                .like(StexpectedFinishTime::getClassname, "www")
                .leftJoin(PiplanActivity.class, PiplanActivity::getId, Dfcvtrial::getId)

        );
        System.out.println("=====");
    }


    @Test
    public void test3() {
        String sql = " SELECT plannable_ref_id FROM piresource_assignment WHERE piresource_assignment.rsrc_ref_id IN (\n" +
                "SELECT id FROM piresource WHERE piresource.user_ref_id IN (\n" +
                "SELECT DISTINCT (ml.rolebobject_id) FROM membership_link ml,pigroup WHERE pigroup.id=ml.roleaobject_id)) ";

        Long parseDate1 = DateUtils.parseDate("2021-04-09 00:00:00");
        Long parseDate2 = DateUtils.parseDate("2021-04-23 23:00:00");
        Date date1 = new Date(parseDate1);
        Date date2 = new Date(parseDate2);

        List<PiplanActivityVo> piplanActivityVos = piplanActivityService.selectJoinList(PiplanActivityVo.class, new MPJLambdaWrapper<>()
                .selectAs(PiplanActivity::getId, "activityId")
                .selectAs(PiplanActivity::getName, "activityName")
                .selectAs(PiplanActivity::getTargetStartDate, "targetStartTime")
                .selectAs(PiplanActivity::getTargetEndDate, "byTime")
                .selectAs(StexpectedFinishTime::getExpectedFinishTime, "expectedFinishTime")
                .selectAs(PiplanActivity::getActualEndDate, "actualEndTime")
                .selectAs(PiplanActivity::getActualStartDate, "actualStartTime")
                .selectAs(Piproject::getProjectName, "projectName")
                .leftJoin(Piproject.class, Piproject::getId, PiplanActivity::getProjectRefId)
                .leftJoin(StexpectedFinishTime.class, StexpectedFinishTime::getPlanActivityRefId, PiplanActivity::getId)
                .eq(PiplanActivity::getProjectRefId, 1001)
                .eq(PiplanActivity::getProjectRefId, 20003)
                .between(PiplanActivity::getTargetStartDate, date1, date2)
                .inSql(PiplanActivity::getId, sql)
        );


    }


    @Test
    public void test4() {
        List<Integer> groupIds=Arrays.asList(1,2,3,4,5,6,7);
        List<List<Integer>> partition = null;
        try {
            partition = Lists.partition(groupIds, 900);
        } catch (Exception e) {
        }
        MPJLambdaWrapper<Object> wrapper2 = new MPJLambdaWrapper<>();
        wrapper2.select(MembershipLink::getRolebobjectId);
        wrapper2.leftJoin(Pigroup.class, Pigroup::getId, MembershipLink::getRoleaobjectId);
        if (CollectionUtils.isNotEmpty(partition)){
            for (List<Integer> integers : partition) {
                wrapper2.or(objectMPJLambdaWrapper -> objectMPJLambdaWrapper.in(Pigroup::getId,integers));
            }
        }
        //MembershipLink  RolebobjectId 集合
        List<Integer> rolebobjectIds = membershipLinkMapper.selectJoinList(Integer.class, wrapper2);
        if (CollectionUtils.isNotEmpty(rolebobjectIds)){
            MPJLambdaWrapper<Piresource> wrapper3 = new MPJLambdaWrapper();
            wrapper3.select(Piresource::getId);
            List<List<Integer>> partition1 = Lists.partition(rolebobjectIds, 900);
            for (List<Integer> integers : partition1) {
                wrapper3.or(lambdaQueryWrapper -> lambdaQueryWrapper.in(Piresource::getId,integers));
            }
            //reoourceIds
            List<Integer> reoourceIds = piresourceMapper.selectJoinList(Integer.class, wrapper3);
            System.out.println("==========");
        }
    }
}
