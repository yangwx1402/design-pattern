package com.young.java.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/12/29.
 */
public class SubjectInvocationHandler implements InvocationHandler {

    private RealSubject real;

    public SubjectInvocationHandler(RealSubject real){
        this.real = real;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(real,args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("proxy before");
    }

    public void after() {
        System.out.println("proxy after");
    }
}
