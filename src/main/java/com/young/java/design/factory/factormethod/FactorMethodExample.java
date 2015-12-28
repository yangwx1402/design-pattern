package com.young.java.design.factory.factormethod;

/**
 * Created by Administrator on 2015/12/28.
 */
public class FactorMethodExample {
    public static void main(String[] args) {
        /**
         * 1.首先创建一个生产EmailSender的工厂类
         * 2.创建一个EmailSender
         * 3.发送
         */
        Provider emailProvider = new EmailProvider();
        Sender sender = emailProvider.createSender();
        sender.send();
        /**
         * 如果需要Sms的实现就需要先创建工厂再生产Sender来完成
         */
        Provider smsProvider = new SmsProvider();
        Sender sms = smsProvider.createSender();
        sms.send();
        /**
         * 如果要扩展一个新的Sender的话,那么具体的产品(也就是Sender)和工厂都需要写代码
         */
    }
}
