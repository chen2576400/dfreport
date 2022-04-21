package com.df.report.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.df.report.model.PiplanActivity;
import com.df.report.model.PiplanActivityVo;
import com.df.report.service.PiplanActivityService;
import com.df.report.dao.PiplanActivityMapper;
import com.df.util.DateUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author chenning
* @description 针对表【piplan_activity】的数据库操作Service实现
* @createDate 2022-04-20 16:14:33
*/
@Service
public class PiplanActivityServiceImpl extends ServiceImpl<PiplanActivityMapper, PiplanActivity>
    implements PiplanActivityService{




    @Override
    public List<PiplanActivityVo> WorkDelayTable(String[] time, String[] group, String projectId, String planId) {
        Date startDate = DateUtils.getEndTime(DateUtils.getDate(System.currentTimeMillis(),0,-3,0,0,0,0));
        Date endDate = DateUtils.getStartTime(System.currentTimeMillis());
        String startTime = DateUtils.format(startDate, "yyyy-MM-dd HH:mm:ss");
        String endTime = DateUtils.format(endDate, "yyyy-MM-dd HH:mm:ss");



//        List<PiplanActivityVo> list = planOTMapper.WorkDelayTable(startTime, endTime, group, projectId, planId);



        return null;
    }
}




