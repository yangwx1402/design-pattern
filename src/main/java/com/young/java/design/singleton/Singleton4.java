package com.young.java.design.singleton;

/**
 * Created by Administrator on 2015/12/28.
 * 没有一个最完美的方式,应该不同的情况不同对待
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            initInstance();
        }
        return instance;
    }

    private static synchronized void initInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
    }
}
