package com.young.java.design.factory.factormethod;

/**
 * Created by Administrator on 2015/12/28.
 */
public class EmailSender implements Sender{
    public void send() {
        System.out.println("email sender");
    }
}
