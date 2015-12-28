package com.young.java.design.builder;

/**
 * Created by Administrator on 2015/12/28.
 */
public class BuilderExample {
    public static void main(String[] args){
        Builder builder = new ProductBuilder();
        Director director = new Director(builder);
        Product p = director.createProduct();
        System.out.println(p.getPart1());
    }
}
