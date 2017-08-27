package com.by.source.dp.iaac;

/**
 * 说明文件 思想
 *
 */
public class App {
    //框架编程原则
    public void t1() {
        System.out.println("面向接口\n" +
                "抽象类进行编程\n" +
                "也就是说,只要接口,抽象类是稳定的,一般可以抛开具体的实现类进行编程,容易形成一个稳定的框架");
    }

    //与框架的关系
    public void t2() {
        System.out.println("框架包括方法框架和流程框架\n");
    }

    //语义描述
    public void t3() {
        System.out.println("接口interface\n" +
                "抽象类abstract\n" +
                "------------------------------------反映出来的是思考阶段\n" +
                "子类class反映出来的是实现阶段\n" +
                "\n" +
                "接口 抽象类的区别:前者是用顺序描述的,后者是顺序+共享的问题\n");
    }

    //执行方法
    public static void main( String[] args ) {
        new App().t1();
        new App().t2();
        new App().t3();
    }
}
