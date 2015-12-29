package com.young.java.design.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2015/12/29.
 */
public class JDKProxyExample {
    public static void main(String[] args) {
        Subject proxy = (Subject) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),new Class[]{Subject.class},new SubjectInvocationHandler(new RealSubject()));
        proxy.work();
    }
}
