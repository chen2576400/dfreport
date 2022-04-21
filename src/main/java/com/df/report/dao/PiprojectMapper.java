package com.df.report.dao;

import com.df.report.model.Piproject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author chenning
* @description 针对表【piproject】的数据库操作Mapper
* @createDate 2022-04-20 15:58:52
* @Entity com.df.report.model.Piproject
*/

@Mapper
public interface PiprojectMapper extends MPJBaseMapper<Piproject> {
}




