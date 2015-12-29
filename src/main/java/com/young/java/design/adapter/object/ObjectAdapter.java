package com.young.java.design.adapter.object;

import com.young.java.design.adapter.clazz.Source;
import com.young.java.design.adapter.clazz.Targetable;

/**
 * Created by Administrator on 2015/12/29.
 * 对象的适配
 * 只是把之前的继承换成了组合
 *
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，
 * 可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source){
        this.source = source;
    }

    public void method1() {
     source.method1();
    }

    public void method2() {
      System.out.println("ObjectAdapter method2");
    }
}
