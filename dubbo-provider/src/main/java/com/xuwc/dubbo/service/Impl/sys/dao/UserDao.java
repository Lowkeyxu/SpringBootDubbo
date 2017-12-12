/*
 * @(#) UserDao.java 2017/12/7
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.service.Impl.sys.dao;

import com.xuwc.dubbo.models.logic.sys.UserVo;
import org.springframework.stereotype.Repository;

/** 用户Dao
 * @author xuwc
 * @version 1.0
 * @since 2017/12/7
 */
@Repository
public interface UserDao {
    //获取用户信息
    UserVo getUser(String loginName);
}
