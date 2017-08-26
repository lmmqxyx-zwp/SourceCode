package com.by.source.dp.iaac.explain;

/**
 * Created by byvai on 2017/6/1.
 */
public abstract class Computer {
    //抽象类

    abstract void makeHardDisk(); //表明每类的电脑有不一样的硬盘
    abstract void makeOptical(); //表明每类电脑有不一样的光驱
    abstract void makeMonitor(); //表明每类电脑有不一样的显示器

    //说明所有的电脑都是拥有同一种主板 共享
    void makeMainBoard() {

    }

    //抽象类就是  顺序 + 共享

}
