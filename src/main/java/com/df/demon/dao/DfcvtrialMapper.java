package com.df.demon.dao;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.df.demon.model.Dfcvtrial;
import com.df.demon.constant.DBType;
import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS(DBType.MYSQL)
public interface DfcvtrialMapper extends MPJBaseMapper<Dfcvtrial> {

}