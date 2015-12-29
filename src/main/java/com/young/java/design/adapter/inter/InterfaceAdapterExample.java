package com.young.java.design.adapter.inter;

/**
 * Created by Administrator on 2015/12/29.
 */
public class InterfaceAdapterExample {
    public static void main(String[] args){
        Source source = new SourceSub1();
        source.method1();
        source.method2();
        source.method3();
    }
}
