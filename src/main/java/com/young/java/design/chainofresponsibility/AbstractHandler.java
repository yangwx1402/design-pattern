package com.young.java.design.chainofresponsibility;

/**
 * Created by dell on 2016/1/5.
 */
public abstract class AbstractHandler implements Handler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
