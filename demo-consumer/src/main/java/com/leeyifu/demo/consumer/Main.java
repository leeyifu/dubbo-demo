/*
 * @(#) Main.java 2017年02月06日
 * 
 * Copyright leeyifu. All rights reserved.
 */
package com.leeyifu.demo.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hzliyifu
 * @version 2017年02月06日
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("demo-consumer服务启动...");
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"consumer-demo-application-context.xml"});
    }
}
