package com.young.java.design.listenerorobserve;

/**
 * Created by Administrator on 2016/1/4.
 */
public class PriceUpListener implements Listener {
    public void action(Event event) {
        if (event instanceof PriceUpEvent)
            System.out.println("price up");
    }
}
