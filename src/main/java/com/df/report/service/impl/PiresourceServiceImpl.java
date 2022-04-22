package com.df.report.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.df.report.model.Piresource;
import com.df.report.service.PiresourceService;
import com.df.report.dao.PiresourceMapper;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author chenning
* @description 针对表【piresource】的数据库操作Service实现
* @createDate 2022-04-21 15:27:47
*/
@Service
public class PiresourceServiceImpl extends MPJBaseServiceImpl<PiresourceMapper, Piresource>
    implements PiresourceService{

    @Autowired
    private  PiresourceMapper piresourceMapper;

    @Override
    public List<Integer> resourceIds(List<Integer> rolebobjectIds) {
        if (CollectionUtils.isEmpty(rolebobjectIds)) return null;
        MPJLambdaWrapper<Piresource> wrapper3 = new MPJLambdaWrapper();
        wrapper3.select(Piresource::getId);
        List<List<Integer>> partition1 = Lists.partition(rolebobjectIds, 900);
        for (List<Integer> integers : partition1) {
            wrapper3.or(mPJLambdaWrapper -> mPJLambdaWrapper.in(
                    Piresource::getUserRefId, integers
            ));
        }
        //reoourceIds
        List<Integer> reoourceIds = piresourceMapper.selectJoinList(Integer.class, wrapper3);
        return reoourceIds;
    }
}




