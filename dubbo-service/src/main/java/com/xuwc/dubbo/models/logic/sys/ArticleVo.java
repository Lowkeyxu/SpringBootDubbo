/*
 * @(#) ArticleVo.java 2017/12/20
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.models.logic.sys;

import com.xuwc.dubbo.models.base.entity.BaseEntity;

/** 文章vo
 * @author xuwc
 * @version 1.0
 * @since 2017/12/20
 */
public class ArticleVo extends BaseEntity {
    //id
    private String id;
    //用户id
    private String userId;
    //标题
    private String title;
    //内容
    private String content;
    //删除标识
    private String delFlag;
    //创建时间
    private String addTime;
    //创建者
    private String addUserId;
    //创建页面ID
    private String addMark;
    //更新时间
    private String updTime;
    //更新者
    private String updUserId;
    //更新页面ID
    private String updMark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddMark() {
        return addMark;
    }

    public void setAddMark(String addMark) {
        this.addMark = addMark;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    public String getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId;
    }

    public String getUpdMark() {
        return updMark;
    }

    public void setUpdMark(String updMark) {
        this.updMark = updMark;
    }

    @Override
    public String toString() {
        return "{id="+id+"用户id="+userId+"标题="+title+"内容="+content+"}";
    }
}
