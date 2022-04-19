package com.df.report.dao;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.df.report.model.Dfcvtrial;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//@DS("db02")
public interface DfcvtrialMapper extends BaseMapper<Dfcvtrial> {

}