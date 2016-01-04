package com.young.java.design.templatemethod;

/**
 * Created by Administrator on 2016/1/4.
 */
public interface ICalculate {
    double calculate(String exp);

    double[] split(String exp,String op);
}
