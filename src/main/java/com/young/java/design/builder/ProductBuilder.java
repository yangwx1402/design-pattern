package com.young.java.design.builder;

/**
 * Created by Administrator on 2015/12/28.
 */
public class ProductBuilder extends Builder {

    private Product product = new Product();

    public void buildPart1() {

        product.setPart1("1");
    }

    public void buildPart2() {

        product.setPart2("2");

    }

    public void buildPart3() {

        product.setPart3("3");
    }

    @Override
    public Product getProduct() {
        return product;
    }


}
