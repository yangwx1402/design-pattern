package com.young.java.design.factory.abstractfactory;

/**
 * Created by Administrator on 2015/12/28.
 */
public class ProductFactory implements IFactory{
    public IProduct1 createIProduct1() {
        return new Product1();
    }

    public IProduct2 createIProduct2() {
        return new Product2();
    }
}
