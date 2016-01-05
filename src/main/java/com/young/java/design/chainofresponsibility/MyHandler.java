package com.young.java.design.chainofresponsibility;

/**
 * Created by dell on 2016/1/5.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public void operate() {
       if(getHandler()!=null){
           getHandler().operate();
       }
        System.out.println(name+"  handler execute");
    }
}
