/*
 * @(#) DemoAction.java 2017/12/8
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.controller;

import com.xuwc.dubbo.service.ArticleService;
import com.xuwc.dubbo.service.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    //文章Service
    @Autowired
    private ArticleService articleService;

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

    /**
     * 获取文章详情
     * @return
     */
    @RequestMapping("article")
    @ResponseBody
    public String article(String id){
        if(StringUtils.isEmpty(id)){
            id = "1";//测试
        }
        return articleService.getArticleInfo(id).toString();
    }

}
