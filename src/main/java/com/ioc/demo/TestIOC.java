package com.ioc.demo;

import com.ioc.demo.bean.UserService;

/**
 * @time 2023/6/28 4:22 下午
 * @Author feikong
 */
public class TestIOC {

    public static void main(String[] args) throws Exception {
        MyApplicationContext myApplicationContext=new MyApplicationContext();
        UserService userService =(UserService)myApplicationContext.getBean("userService");
        userService.findUser("张三");
    }
}
