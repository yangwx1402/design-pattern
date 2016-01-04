package com.young.java.design.templatemethod;

/**
 * Created by Administrator on 2016/1/4.
 */
public class TemplateMethodExample {
    public static void main(String[] args) {
        ICalculate cal = new PlusCalculator();
        System.out.println(cal.calculate("1+2"));
    }
}
