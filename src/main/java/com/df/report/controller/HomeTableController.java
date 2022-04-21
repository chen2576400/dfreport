package com.df.report.controller;

import com.df.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 大屏展示工作任务延期
     */
    @GetMapping(value = "/WorkDelayTable")
    @ApiOperation(value = "工作任务延期报表")
    public Result WorkDelayTable() {

        return null;

    }
}
