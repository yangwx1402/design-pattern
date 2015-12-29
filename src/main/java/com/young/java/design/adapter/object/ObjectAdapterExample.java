package com.young.java.design.adapter.object;

import com.young.java.design.adapter.clazz.Source;
import com.young.java.design.adapter.clazz.Targetable;

/**
 * Created by Administrator on 2015/12/29.
 */
public class ObjectAdapterExample {
    public static void main(String[] args){
        Targetable target = new ObjectAdapter(new Source());
        target.method1();
        target.method2();
    }
}
