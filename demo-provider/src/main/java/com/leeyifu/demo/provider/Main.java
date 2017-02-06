/*
 * @(#) Main.java 2017年02月06日
 * 
 * Copyright 2017 Leeyifu. All rights reserved.
 */
package com.leeyifu.demo.provider;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hzliyifu
 * @version 2017年02月06日
 */

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("demo-service服务启动...");
        /**
         * 自动加载META-INF/spring目录下的所有Spring配置
         * 可以在dubbo.properties文件中指定要加载的spring文件位置
         * dubbo.spring.config=classpath*:META-INF/spring/*.xml ----配置spring配置加载位置
         * 本程序中指定一个spring主配置文件, 其他配置文件通过主配置文件import
         */
        com.alibaba.dubbo.container.Main.main(args);
    }
}
