package com.young.java.design.listenerorobserve;

/**
 * Created by Administrator on 2016/1/4.
 */
public class PriceUpdateNotify implements  Listener {
    public void action(Event event) {
        System.out.println("不管涨价还是降价,我都要通知价格更新");
    }
}
