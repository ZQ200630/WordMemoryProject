package com.zq.web;

import com.zq.tools.test.TTTT;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.sql.DataSource;

@SpringBootTest
public class MyApplicationTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    TTTT te;

    @Test
    public void test(){
        System.out.println(dataSource.getClass());
    }

    @Test
    public void t() {
        System.out.println(te);
    }
}
