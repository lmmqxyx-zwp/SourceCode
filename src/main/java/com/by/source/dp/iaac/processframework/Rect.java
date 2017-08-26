package com.by.source.dp.iaac.processframework;

import java.util.Scanner;

/**
 * 矩形
 */
public class Rect implements IShape{
    float width, height;

    public boolean input() {
        System.out.println("请输入宽，高：");
        Scanner sc = new Scanner(System.in);
        width = sc.nextFloat();
        height = sc.nextFloat();

        return true;
    }

    public float getArea() {
        float s = width * height;
        return s;
    }
}
