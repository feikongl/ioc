package com.ioc.demo.anotation;

import java.lang.annotation.*;

/**
 * @time 2023/6/28 4:18 下午
 * @Author feikong
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyComponent {

    String value() default  "";

}
