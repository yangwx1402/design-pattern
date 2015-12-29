package com.young.java.design.adapter.clazz;

/**
 * Created by Administrator on 2015/12/29.
 * 类的适配
 * 这样就将Source中的method1适配到了Targetable接口中
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，
 * 可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 */
public class ClassAdapter extends Source implements Targetable {
    public void method2() {
      System.out.println("ClassAdapter method2");
    }
}
