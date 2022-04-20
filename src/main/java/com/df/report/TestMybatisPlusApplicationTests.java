package com.df.report;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.df.report.dao.DfcvtrialMapper;
import com.df.report.model.Dfcvtrial;
import com.df.report.service.DfcvtrialService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-19 16:59
 **/
@SpringBootTest
@Log4j2
public class TestMybatisPlusApplicationTests {
    @Autowired
    private DfcvtrialMapper dfcvtrialMapper;

    @Autowired
    private DfcvtrialService dfcvtrialService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Dfcvtrial> userList = dfcvtrialMapper.selectList(null);


        LambdaQueryWrapper<Dfcvtrial> lqw = Wrappers.lambdaQuery();
        lqw.eq(Dfcvtrial::getTrialNature, 4)
                .like(Dfcvtrial::getName, "1")
                .select(Dfcvtrial::getName);
        List<Dfcvtrial> dfcvtrials = dfcvtrialMapper.selectList(lqw);
        System.out.println(dfcvtrials);


        Dfcvtrial one = dfcvtrialService.getOne(lqw);
        Dfcvtrial byId = dfcvtrialService.getById(698706);
        log.info("=============");

    }

}
