/*
 * @(#) DemoAction.java 2017/12/8
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.controller;

import com.xuwc.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2017/12/8
 */
@RestController
@RequestMapping("")
public class DemoAction {

    @Autowired
    private DemoService demoService;

    @RequestMapping("index")
    public String index(){
        return demoService.sayHello("xwc123");
    }



}
