package com.young.java.design.adapter.inter;

/**
 * Created by Administrator on 2015/12/29.
 * 接口的适配
 * 适配器,只实现了其中的method3,那么还有两个方法需要其他的子类实现
 * 也就是说接口中的方法很多,其中子类不想实现所有的方法这时候就用接口的适配
 */
public abstract class InterfaceAdapter implements Source{
    public void method3() {
        System.out.println("InterfaceAdapter method3");
    }
}
