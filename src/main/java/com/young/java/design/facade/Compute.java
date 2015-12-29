package com.young.java.design.facade;

/**
 * Created by Administrator on 2015/12/29.
 * 门面(外观)模式
 * 如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，产生关系，
 * 这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，这不是我们想要看到的，
 * 有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用，这，就是外观模式！
 */
public class Compute {
    private Cpu cpu = new Cpu();

    private Disk disk = new Disk();

    private Memory memory = new Memory();

    public void startUp(){
        disk.startUp();
        memory.startUp();
        cpu.startUp();
        System.out.println("compute startup");
    }

    public void shutDown(){
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
        System.out.println("compute shutdown");
    }
}
