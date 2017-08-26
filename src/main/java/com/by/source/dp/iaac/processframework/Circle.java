package com.by.source.dp.iaac.processframework;

import java.util.Scanner;

/**
 * 圆类
 */
public class Circle implements IShape{

    float r; //半径

    public float getArea() {
        float s = (float) Math.PI * r * r;
        return s;
    }

    public boolean input() {
        System.out.println("请输入半径：");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();

        return true;
    }
}
