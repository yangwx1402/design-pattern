package com.young.java.design.adapter.clazz;

/**
 * Created by Administrator on 2015/12/29.
 * 原来的类里面有1个方法method1,但是目标接口中有两个方法method1和method2,现在想通过原来类中的method1作为接口的实现
 *
 */
public class Source {
    public void method1(){
        System.out.println("Source method1");
    }
}
