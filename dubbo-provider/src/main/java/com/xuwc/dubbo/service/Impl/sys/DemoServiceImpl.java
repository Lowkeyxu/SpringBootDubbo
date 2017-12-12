/*
 * @(#) DemoServiceImpl.java 2017/12/8
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.service.Impl.sys;


import com.xuwc.dubbo.service.DemoService;
import com.xuwc.dubbo.service.Impl.sys.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 测试demo实现类
 * @author xuwc
 * @version 1.0
 * @since 2017/12/8
 */
@Service
public class DemoServiceImpl implements DemoService {
    //用户dao
    @Autowired
    private UserDao userDao;

    @Override
    public String sayHello(String name) {
        return "测试 数据" + userDao.getUser(name);
    }
}
