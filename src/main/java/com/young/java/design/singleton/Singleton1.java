package com.young.java.design.singleton;

/**
 * Created by Administrator on 2015/12/28.
 * 这样的单例是存在线程不安全问题的,比如多线程同时调用getInstance就可能产生多个instance对象
 */
public class Singleton1 {
    private Singleton1() {
    }

    private static Singleton1 instance;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
