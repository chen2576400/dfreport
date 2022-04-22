package com.df.report.service.impl;

import com.df.report.model.MembershipLink;
import com.df.report.model.Pigroup;
import com.df.report.service.MembershipLinkService;
import com.df.report.dao.MembershipLinkMapper;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author chenning
* @description 针对表【membership_link】的数据库操作Service实现
* @createDate 2022-04-21 15:28:26
*/
@Service
public class MembershipLinkServiceImpl extends MPJBaseServiceImpl<MembershipLinkMapper, MembershipLink>
    implements MembershipLinkService{

    @Autowired
    MembershipLinkMapper membershipLinkMapper;


    @Override
    public List<Integer> rolebobjectIds(List<Integer> groupIds) {
        MPJLambdaWrapper<Object> wrapper2 = new MPJLambdaWrapper<>();
        wrapper2.select(MembershipLink::getRolebobjectId);
        wrapper2.innerJoin(Pigroup.class, Pigroup::getId, MembershipLink::getRoleaobjectId);
        if (CollectionUtils.isNotEmpty(groupIds)) {
            List<List<Integer>> partition = Lists.partition(groupIds, 900);
            for (List<Integer> integers : partition) {
                wrapper2.or(mPJLambdaWrapper -> mPJLambdaWrapper.in(Pigroup::getId, integers));
            }
        }
        wrapper2.groupBy(MembershipLink::getRolebobjectId);
        List<Integer> rolebobjectIds = membershipLinkMapper.selectJoinList(Integer.class, wrapper2);
        return rolebobjectIds;
    }
}




