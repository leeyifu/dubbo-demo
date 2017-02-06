/*
 * @(#) DemoService.java 2017年02月06日
 * 
 * Copyright 2017 Leeyifu. All rights reserved.
 */
package com.leeyifu.demo.openapi;

/**
 * @author liyifu
 * @version 2017年02月06日
 */
public interface DemoService {
    /**
     * 服务对外暴露的接口
     *
     * @param request
     * @return
     */
    public String serve(String request);
}
