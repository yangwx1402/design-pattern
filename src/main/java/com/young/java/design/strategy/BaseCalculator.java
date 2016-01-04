package com.young.java.design.strategy;

/**
 * Created by dell on 2016/1/4.
 */
public class BaseCalculator {
    protected double[] split(String exp,String op){
        String[] temp = exp.split(op);
        double v1 = Double.parseDouble(temp[0]);
        double v2 = Double.parseDouble(temp[1]);
        double[] result = new double[2];
        result[0] = v1;
        result[1]=v2;
        return result;
    }
}
