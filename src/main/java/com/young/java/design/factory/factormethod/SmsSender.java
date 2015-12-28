package com.young.java.design.factory.factormethod;

/**
 * Created by Administrator on 2015/12/28.
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("sms sender");
    }
}
