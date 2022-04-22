package com.df.report.service;

import com.df.report.model.MembershipLink;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.yulichang.base.MPJBaseService;

import java.util.List;

/**
* @author chenning
* @description 针对表【membership_link】的数据库操作Service
* @createDate 2022-04-21 15:28:26
*/
public interface MembershipLinkService extends MPJBaseService<MembershipLink> {


    //membership_link A 和 pigroup B 查询    A.rolebobject_id
     List<Integer> rolebobjectIds(List<Integer> groupIds);
}
