package com.young.java.design.factory.factormethod;

/**
 * Created by Administrator on 2015/12/28.
 */
public class SmsProvider implements Provider {
    public Sender createSender() {
        return new SmsSender();
    }
}
