package com.df.report.test;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.df.report.model.Piproject;
import com.df.report.service.PiprojectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-20 16:00
 **/
@SpringBootTest
public class RunTest {
    @Autowired
    private PiprojectService  piprojectService;



    @Test
    public  void  test1(){
        List<Piproject> list = piprojectService.list(Wrappers.<Piproject>lambdaQuery()
                .select(Piproject::getId)
        );
        System.out.println(list);

    }
}
