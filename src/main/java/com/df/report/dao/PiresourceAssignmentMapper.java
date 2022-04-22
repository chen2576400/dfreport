package com.df.report.dao;

import com.df.report.model.PiresourceAssignment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author chenning
* @description 针对表【piresource_assignment】的数据库操作Mapper
* @createDate 2022-04-21 15:19:28
* @Entity com.df.report.model.PiresourceAssignment
*/
@Mapper
public interface PiresourceAssignmentMapper extends  MPJBaseMapper<PiresourceAssignment> {
}




