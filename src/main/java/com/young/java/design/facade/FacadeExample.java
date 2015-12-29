package com.young.java.design.facade;

/**
 * Created by Administrator on 2015/12/29.
 */
public class FacadeExample {
    public static void main(String[] args){
        Compute compute = new Compute();
        compute.startUp();
        compute.shutDown();
    }
}
