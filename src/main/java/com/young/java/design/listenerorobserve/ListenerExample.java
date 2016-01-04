package com.young.java.design.listenerorobserve;

/**
 * Created by Administrator on 2016/1/4.
 */
public class ListenerExample {
    public static void main(String[] args) {
        Productor productor = new Productor();
        productor.addPriceListener(new PriceDownListener());
        productor.addPriceListener(new PriceUpListener());
        productor.addPriceListener(new PriceUpdateNotify());
        productor.priceUp();
    }
}
