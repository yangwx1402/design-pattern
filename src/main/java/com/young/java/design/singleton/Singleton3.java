package com.young.java.design.singleton;

/**
 * Created by Administrator on 2015/12/28.
 * 这样做可以保证多线程没有问题,但是如果构造方法报错了就无法获取instance对象了
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 instance = new Singleton3();

    public static Singleton3 getInstance() {
        return instance;
    }
}
