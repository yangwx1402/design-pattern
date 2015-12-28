package com.young.java.design.singleton;

/**
 * Created by Administrator on 2015/12/28.
 * 这样虽然不会创建多个对象,但是多线程下又存在性能问题,因为调用getInstance方法是线程互斥的,相当于单线程调用
 */
public class Singleton2 {
    private static Singleton2 instance;

    public synchronized static Singleton2 getInstance(){
         if(instance==null){
             instance = new Singleton2();
         }
        return instance;
    }
}
