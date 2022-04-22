package com.df.report.service;

import com.df.report.model.Piresource;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.yulichang.base.MPJBaseService;

import java.util.List;

/**
* @author chenning
* @description 针对表【piresource】的数据库操作Service
* @createDate 2022-04-21 15:27:47
*/
public interface PiresourceService extends MPJBaseService<Piresource> {
    //通过 membership_link 的 rolebobject_id == user_ref_id为条件查询 piresource
    List<Integer> resourceIds(List<Integer> rolebobjectIds);
}
