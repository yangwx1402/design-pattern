package com.young.java.design.adapter.clazz;

/**
 * Created by Administrator on 2015/12/29.
 */
public class ClassAdapterExample {
    public static void main(String[] args){
        Targetable target = new ClassAdapter();
        target.method1();
        target.method2();
    }
}
