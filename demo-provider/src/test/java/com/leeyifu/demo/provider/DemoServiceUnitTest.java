/*
 * @(#) DemoServiceUnitTest.java 2017年02月06日
 * 
 * Copyright leeyifu. All rights reserved.
 */
package com.leeyifu.demo.provider;

import org.junit.Before;
import org.junit.Test;

import com.leeyifu.demo.abst.AbstractUnitTest;
import com.leeyifu.demo.openapi.DemoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hzliyifu
 * @version 2017年02月06日
 */
@Slf4j
public class DemoServiceUnitTest extends AbstractUnitTest {
    private DemoService demoService;

    @Before
    public void init() {
        // 获取定义的 Web Service Bean
        demoService = (DemoService) consumerContext.getBean("demoService");
    }

    @Test
    public void consume() {
        stub();
        log.info(demoService.serve("test service"));
    }
}
