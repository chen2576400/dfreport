package com.df.report;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.df.report.dao.DfcvtrialMapper;
import com.df.report.model.Dfcvtrial;
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
public class TestMybatisPlusApplicationTests {
    @Autowired
    private DfcvtrialMapper dfcvtrialMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Dfcvtrial> userList = dfcvtrialMapper.selectList(null);
        System.out.println(userList);


        LambdaQueryWrapper<Dfcvtrial> lqw = Wrappers.lambdaQuery();
        lqw.eq(Dfcvtrial::getTrialNature,4)
            .like(Dfcvtrial::getName, "1");
        List<Dfcvtrial> dfcvtrials = dfcvtrialMapper.selectList(lqw);
        System.out.println(dfcvtrials);
    }

}
