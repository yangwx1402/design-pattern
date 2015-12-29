package com.young.java.design.bridge;

/**
 * Created by Administrator on 2015/12/29.
 */
public class SubBridge extends SourceBridge {
    public SubBridge(Sourceable source) {
        super(source);
    }

    @Override
    public void getConnection() {
       this.source.work();
    }
}
