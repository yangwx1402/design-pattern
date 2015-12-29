package com.young.java.design.decorator;

/**
 * Created by Administrator on 2015/12/29.
 */
public class Decorator {

    private Sourceable source;

    public Decorator(Sourceable source){
        this.source = source;
    }

    public void work() {
       System.out.println("Decorator 包装了 Source");
        source.work();
    }
}
