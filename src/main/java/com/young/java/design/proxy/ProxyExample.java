package com.young.java.design.proxy;

/**
 * Created by Administrator on 2015/12/29.
 */
public class ProxyExample {
    public static void main(String[] args){
        Subject subject = new ProxySubject(new RealSubject());
        subject.work();
    }
}
