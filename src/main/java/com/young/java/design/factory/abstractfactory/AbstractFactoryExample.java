package com.young.java.design.factory.abstractfactory;

/**
 * Created by Administrator on 2015/12/28.
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {
        /**
         * 其实这个抽象工厂模式中去掉一个产品,变成统一的一个产品的话就变成了工厂方法模式
         */
        IFactory factory = new ProductFactory();
        factory.createIProduct1().work();
        factory.createIProduct2().work();
    }
}
