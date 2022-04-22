package com.df.report.controller;

import com.df.report.model.PiplanActivityVo;
import com.df.report.service.PiplanActivityService;
import com.df.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-20 16:39
 **/
@RestController
@RequestMapping("/HomeTable")
@Slf4j
@Api(tags = "首页报表展示")
public class HomeTableController {
    @Autowired
    PiplanActivityService  piplanActivityService;

    /**
     * 大屏展示工作任务延期
     */
    @GetMapping(value = "/WorkDelayTable")
    @ApiOperation(value = "工作任务延期报表")
    public Result WorkDelayTable() {
        List<PiplanActivityVo> piplanActivityVos = piplanActivityService.WorkDelayTable(null, null, null, null);
        return Result.ok(piplanActivityVos);
    }
}
