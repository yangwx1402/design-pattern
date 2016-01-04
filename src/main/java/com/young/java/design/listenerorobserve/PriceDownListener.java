package com.young.java.design.listenerorobserve;

/**
 * Created by Administrator on 2016/1/4.
 */
public class PriceDownListener implements Listener {
    public void action(Event event) {
        if (event instanceof PriceDownEvent)
            System.out.println("price down");
    }
}
