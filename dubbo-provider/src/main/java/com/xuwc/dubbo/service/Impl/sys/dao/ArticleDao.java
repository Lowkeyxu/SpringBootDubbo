/*
 * @(#) ArticleDao.java 2017/12/20
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.service.Impl.sys.dao;

import com.xuwc.dubbo.models.logic.sys.ArticleVo;
import org.apache.ibatis.annotations.Mapper;

/** 文章Dao
 * @author xuwc
 * @version 1.0
 * @since 2017/12/20
 */
@Mapper
public interface ArticleDao {
    /**
     * 根据id获取文章详情
     * @param id
     * @return
     */
    ArticleVo getArticleInfo(String id);
}
