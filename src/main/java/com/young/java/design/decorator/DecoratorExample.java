package com.young.java.design.decorator;

/**
 * Created by Administrator on 2015/12/29.
 * 包装器模式
 * Source和Decorator可以不实现相同的接口,然后在Decorator中包装Source实现一些其他的行为
 * 这是跟代理模式的区别,代理模式Real和Proxy必须实现相同的接口
 * 跟jdk里的FileInputStream,BufferedReader等等设计就是包装器模式,BufferedReader可以装饰FileInputStream
 * 但是他们并没有实现相同的接口
 */
public class DecoratorExample {
    public static void main(String[] args){
        Sourceable source = new Source();
        source.work();
        Decorator dec = new Decorator(source);
        dec.work();
    }
}
