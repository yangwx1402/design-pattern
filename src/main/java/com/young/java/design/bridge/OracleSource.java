package com.young.java.design.bridge;

/**
 * Created by Administrator on 2015/12/29.
 */
public class OracleSource implements Sourceable {
    public void work() {
        System.out.println("获取一个Oracble connection");
    }
}
