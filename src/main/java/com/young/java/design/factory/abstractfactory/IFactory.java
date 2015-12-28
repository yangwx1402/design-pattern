package com.young.java.design.factory.abstractfactory;

/**
 * Created by Administrator on 2015/12/28.
 */
public interface IFactory {
    /**
     * 工厂中是不同类的产品,那么就是抽象工厂模式
     * @return
     */
    public IProduct1 createIProduct1();
    public IProduct2 createIProduct2();
}
