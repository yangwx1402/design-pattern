package com.young.java.design.bridge;

/**
 * Created by Administrator on 2015/12/29.
 */
public class BridgeExample {
    public static void main(String[] args) {
        SourceBridge bridge = new SubBridge(new OracleSource());
        bridge.getConnection();
        SourceBridge bridge1 = new SubBridge(new MysqlSource());
        bridge1.getConnection();
    }
}
