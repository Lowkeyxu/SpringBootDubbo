/*
 * @(#) ArticleServiceImpl.java 2017/12/20
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.service.Impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.xuwc.dubbo.models.logic.sys.ArticleVo;
import com.xuwc.dubbo.service.ArticleService;
import com.xuwc.dubbo.service.Impl.sys.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;

/** 文章Service实现
 * @author xuwc
 * @version 1.0
 * @since 2017/12/20
 */
@Service(group = "dubbo")
public class ArticleServiceImpl implements ArticleService{

    //文章dao
    @Autowired
    private ArticleDao articleDao;

    /**
     * 根据id获取文章详情
     * @param id
     * @return
     */
    @Override
    public ArticleVo getArticleInfo(String id) {
        return articleDao.getArticleInfo(id);
    }
}
