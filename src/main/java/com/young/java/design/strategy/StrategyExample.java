package com.young.java.design.strategy;

/**
 * Created by dell on 2016/1/4.
 */
public class StrategyExample {

    public static void main(String[] args) {
        Calculate cal = new PlusCalculator();
        System.out.println(cal.calculate("1+2"));
        System.out.println("");
    }
}
