package com.young.java.design.proxy;

/**
 * Created by Administrator on 2015/12/29.
 */
public class RealSubject implements Subject {
    public void work() {
        System.out.println("RealSubject work");
    }
}
