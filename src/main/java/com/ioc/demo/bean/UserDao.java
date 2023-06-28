package com.ioc.demo.bean;

import com.ioc.demo.anotation.MyComponent;

/**
 * @time 2023/6/28 4:23 下午
 * @Author feikong
 */
@MyComponent
public class UserDao {

    public void findUser(String userName) {
        System.out.println("找到了一个用户名字叫:"+userName);
    }
}
