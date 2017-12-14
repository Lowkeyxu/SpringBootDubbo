/*
 * @(#) WebConfigurer.java 2017/9/8
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


/**
 * @author xuwc
 * @version 1.0
 * @since 2017/9/8
 */
@Configuration
public class WebConfigurer extends WebMvcConfigurerAdapter {
    //logger
    private Logger logger = LoggerFactory.getLogger(WebConfigurer.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截规则
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    /**
     * 多模块的jsp访问，默认是src/main/webapp，但是多模块的目录只设置yml文件或propeerties文件不行
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        logger.info("****************/WEB-INF/views/*************************");
        return viewResolver;
    }
}
