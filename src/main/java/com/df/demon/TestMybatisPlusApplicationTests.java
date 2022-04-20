package com.df.demon;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.df.demon.dao.AnchenDemonMapper;
import com.df.demon.dao.DfcvtrialMapper;
import com.df.demon.model.Dfcvtrial;
import com.df.demon.service.DfcvtrialService;
import com.df.util.DateUtils;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

    @Autowired
    private AnchenDemonMapper anchenDemonMapper;

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

//        List<AnchenDemon>  anchenDemons=anchenDemonMapper.selectList(null);
//        System.out.println(anchenDemons);

    }


    @Test
    public  void  test1(){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String end = df.format(new Date());
        //过去一月
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, -3);
//        c.add(Calendar.DAY_OF_MONTH, -7);
        Date m = c.getTime();
        String start = df.format(m);
        String[] time = {start,end};


        Date startTime = DateUtils.getStartTime(System.currentTimeMillis());
        Date endTime = DateUtils.getEndTime(System.currentTimeMillis());
        String format = DateUtils.format(endTime, "yyyy-MM-dd HH:mm:ss");
        System.out.println(end);

    }

}
