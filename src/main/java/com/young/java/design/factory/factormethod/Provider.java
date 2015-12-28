package com.young.java.design.factory.factormethod;

/**
 * Created by Administrator on 2015/12/28.
 */
public interface Provider {
    /**
     * 工厂里是同类产品,那么就是工厂方法模式
     * @return
     */
    public Sender createSender();
}
