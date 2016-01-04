package com.young.java.design.listenerorobserve;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/4.
 */
public class Productor {
    private List<Listener> listeners = new ArrayList<Listener>();

    public void addPriceListener(Listener listener) {
        listeners.add(listener);
    }

    public void priceDown() {
        System.out.println("我要将价格了");
        notify(new PriceDownEvent());
    }

    public void priceUp() {
        System.out.println("我要涨价了");
        notify(new PriceUpEvent());
    }

    private void notify(Event event) {
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).action(event);
        }
    }
}
