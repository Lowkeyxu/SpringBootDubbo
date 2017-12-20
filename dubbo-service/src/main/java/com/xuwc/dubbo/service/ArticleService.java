/*
 * @(#) ArticleService.java 2017/12/20
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.service;

import com.xuwc.dubbo.models.logic.sys.ArticleVo;

/** 文章Service
 * @author xuwc
 * @version 1.0
 * @since 2017/12/20
 */
public interface ArticleService {

    /**
     * 根据id获取文章详情
     * @param id
     * @return
     */
    ArticleVo getArticleInfo(String id);
}
