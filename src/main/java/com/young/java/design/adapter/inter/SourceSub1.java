package com.young.java.design.adapter.inter;

/**
 * Created by Administrator on 2015/12/29.
 * 子类就只需要实现关注的方法即可
 */
public class SourceSub1 extends InterfaceAdapter {
    public void method1() {
       System.out.println("SourceSub1 method1");
    }

    public void method2() {
        System.out.println("SourceSub1 method2");
    }
}
