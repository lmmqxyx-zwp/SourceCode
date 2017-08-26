package com.by.source.dp.iaac.explain;

/**
 * Created by byvai on 2017/6/1.
 */
public interface ICar {
    //接口
    public void cut(); //钢板切割
    public void press(); //压模
    public void composite(); //组装
    public void color(); //喷漆

    //抽象出来了一个汽车制造的过程---属于顺序的现象
}
