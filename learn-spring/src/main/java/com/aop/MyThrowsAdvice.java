package com.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author codiy
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Method m, Object[] os, Object target, Exception e) {
        System.out.println("异常:");
    }
}
