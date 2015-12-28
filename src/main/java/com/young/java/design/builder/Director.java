package com.young.java.design.builder;

/**
 * Created by Administrator on 2015/12/28.
 * 导演类,就相当于来拍摄一部电影似得,一共有3个步骤,都是通过createProduct来控制好流程的
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product createProduct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.getProduct();
    }
}
