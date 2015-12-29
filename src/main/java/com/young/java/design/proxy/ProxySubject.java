package com.young.java.design.proxy;

/**
 * Created by Administrator on 2015/12/29.
 */
public class ProxySubject implements Subject {

    private Subject real;

    public ProxySubject(Subject real) {
        this.real = real;
    }

    public void work() {
        before();
        real.work();
        after();
    }

    public void before() {
        System.out.println("proxy before");
    }

    public void after() {
        System.out.println("proxy after");
    }
}
