package com.young.java.design.strategy;

/**
 * Created by dell on 2016/1/4.
 */
public class PlusCalculator extends BaseCalculator implements Calculate {
    public double calculate(String exp) {
        double[] values = this.split(exp,"\\+");
        return values[0]+values[1];
    }
}
