/*
 * @(#) DemoConsumer.java 2017年02月06日
 * 
 * Copyright leeyifu. All rights reserved.
 */
package com.leeyifu.demo.consumer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.leeyifu.demo.openapi.DemoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hzliyifu
 * @version 2017年02月06日
 */
@Slf4j
@Component(value = "demoConsumer")
public class DemoConsumer {

    @Resource
    private DemoService demoService;

    @PostConstruct
    public void dispatch() {
        log.info(demoService.serve("This is the first request."));
    }

}
