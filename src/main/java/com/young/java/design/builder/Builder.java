package com.young.java.design.builder;

/**
 * Created by Administrator on 2015/12/28.
 * 建造者模式主要用于创建复杂对象,复杂对象是由n个部分构成,通过一一构建某个部分来构建复杂对象
 */
public abstract class Builder {
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract void buildPart3();

    public abstract Product getProduct();
}
