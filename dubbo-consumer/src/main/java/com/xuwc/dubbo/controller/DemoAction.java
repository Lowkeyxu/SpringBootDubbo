/*
 * @(#) DemoAction.java 2017/12/8
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.controller;

import com.xuwc.dubbo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2017/12/8
 */
@Controller
@RequestMapping("test")
public class DemoAction {

    private Logger logger = LoggerFactory.getLogger(DemoAction.class);

    //demoService
    @Autowired
    private DemoService demoService;

    /**
     * 测试数据
     */
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return demoService.sayHello("admin");
    }

    /**
     * 测试数据
     */
    @RequestMapping("frame")
    public String frame(){
        return "frame";
    }
}
