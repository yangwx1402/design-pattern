package com.young.java.design.templatemethod;

/**
 * Created by Administrator on 2016/1/4.
 */
public class PlusCalculator extends CalculateTemplate {
    public double calculate(String exp) {
        double[] values = this.split(exp,"\\+");
        return values[0]+values[1];
    }
}
