/*
 * @(#) DemoServiceImpl.java 2017年02月06日
 * 
 * Copyright 2017 Leeyifu. All rights reserved.
 */
package com.leeyifu.demo.provider;

import com.leeyifu.demo.openapi.DemoService;

/**
 * @author hzliyifu
 * @version 2017年02月06日
 */

public class DemoServiceImpl implements DemoService {

    @Override
    public String serve(String request) {
        return request + "done: Hello world";
    }
}
