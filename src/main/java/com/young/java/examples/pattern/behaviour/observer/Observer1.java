package com.young.java.examples.pattern.behaviour.observer;

/**
 * Created by yangyong3 on 2017/6/30.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 update");
    }
}
