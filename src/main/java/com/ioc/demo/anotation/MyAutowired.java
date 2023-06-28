package com.ioc.demo.anotation;

import java.lang.annotation.*;

/**
 * @time 2023/6/28 4:19 下午
 * @Author feikong
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface MyAutowired {

    String value() default  "";

}
