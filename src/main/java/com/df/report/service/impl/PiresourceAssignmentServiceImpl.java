package com.df.report.service.impl;

import com.df.report.dao.PiresourceMapper;
import com.df.report.model.Piresource;
import com.df.report.model.PiresourceAssignment;
import com.df.report.service.PiresourceAssignmentService;
import com.df.report.dao.PiresourceAssignmentMapper;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author chenning
* @description 针对表【piresource_assignment】的数据库操作Service实现
* @createDate 2022-04-21 15:19:28
*/
@Service
public class PiresourceAssignmentServiceImpl extends MPJBaseServiceImpl<PiresourceAssignmentMapper, PiresourceAssignment>
    implements PiresourceAssignmentService{
    @Autowired
    private PiresourceAssignmentMapper piresourceAssignmentMapper;
    @Override
    public List<Integer> assignmentRsrcIds(List<Integer> reoourceIds) {
        MPJLambdaWrapper<Piresource> wrapper4 = new MPJLambdaWrapper();
        wrapper4.select(PiresourceAssignment::getPlannableRefId);
        List<List<Integer>> partition = Lists.partition(reoourceIds, 900);
        for (List<Integer> integers : partition) {
            wrapper4.or(lambdaQueryWrapper -> lambdaQueryWrapper.in(PiresourceAssignment::getRsrcRefId, integers));
        }
        //piresource_assignment.plannable_id 集
        List<Integer> assignmentRsrcIds = piresourceAssignmentMapper.selectJoinList(Integer.class, wrapper4);
        return assignmentRsrcIds;
    }
}




