package com.ioc.demo.bean;

import com.ioc.demo.anotation.MyAutowired;
import com.ioc.demo.anotation.MyComponent;

/**
 * @time 2023/6/28 4:23 下午
 * @Author feikong
 */
@MyComponent
public class UserService {

    @MyAutowired
    private UserDao userDao;

    public void findUser(String userName) {
        userDao.findUser(userName);
    }


}
