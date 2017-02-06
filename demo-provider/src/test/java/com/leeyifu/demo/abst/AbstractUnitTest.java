/*
 * @(#) AbstractUnitTest.java 2017年02月06日
 *
 * Copyright 2017 Leeyifu. All rights reserved.
 */
package com.leeyifu.demo.abst;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyifu
 * @version 2016年11月01日
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:service-demo-application-context.xml"})
public abstract class AbstractUnitTest {
    // 加载客户端的配置定义
    protected ApplicationContext consumerContext = new ClassPathXmlApplicationContext("consumer-demo-application-context.xml");

    @Test
    public void stub() {
        log.info("msg from abstract unit test, just ignore this.");
    }
}
