package com.young.java.design.chainofresponsibility;

/**
 * Created by dell on 2016/1/5.
 */
public class HandlerExample {
    public static void main(String[] args) {
        AbstractHandler handler1 = new MyHandler("handler-1");
        AbstractHandler handler2 = new MyHandler("handler-2");
        AbstractHandler handler3 = new MyHandler("handler-3");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operate();
    }
}
