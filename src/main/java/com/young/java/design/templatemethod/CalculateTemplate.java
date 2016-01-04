package com.young.java.design.templatemethod;

/**
 * Created by Administrator on 2016/1/4.
 */
public abstract class CalculateTemplate implements ICalculate{
    public double[] split(String exp, String op) {
        String[] temp = exp.split(op);
        double v1 = Double.parseDouble(temp[0]);
        double v2 = Double.parseDouble(temp[1]);
        double[] result = new double[2];
        result[0] = v1;
        result[1]=v2;
        return result;
    }
}
