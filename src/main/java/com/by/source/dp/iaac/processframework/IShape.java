package com.by.source.dp.iaac.processframework;

//===========================================
//问题描述：求圆、矩形的面积
//要求：当求圆的面积时，能输入圆的半径    |    当求矩形的面积时，输入矩形的长，宽

/**
 * 形状接口的定义
 */
public interface IShape {
    boolean input(); //输入方法
    float getArea(); //求面积的方法
}