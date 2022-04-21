package com.df.report.service;

import com.df.report.model.PiplanActivity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.df.report.model.PiplanActivityVo;

import java.text.ParseException;
import java.util.List;

/**
* @author chenning
* @description 针对表【piplan_activity】的数据库操作Service
* @createDate 2022-04-20 16:14:33
*/
public interface PiplanActivityService extends IService<PiplanActivity> {

    public List<PiplanActivityVo> WorkDelayTable(String[] time, String[] group, String projectId, String planId) ;

    }
