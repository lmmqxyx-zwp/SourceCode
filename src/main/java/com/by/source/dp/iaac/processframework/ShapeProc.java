package com.by.source.dp.iaac.processframework;

/**
 * 流程处理类
 */
public class ShapeProc {
    private IShape shape;

    public ShapeProc(IShape shape) {
        this.shape = shape;
    }

    /**
     * 每个形状的面积
     *
     * @return
     */
    public float process() {
        shape.input(); //输入功能
        float value = shape.getArea(); //求面积的功能
        return value; //返回面积
    }
}

//==============================================================
//说明
//ShapeProc是对接口多态对象的封装类。process方法表明了对某形状的统一处理过程
//包括参数输入input方法及其求面积的getArea方法。可以发现的是根本就不需要区实现
//IShape的子类。


//流程框架若获得具体的应用，就必须实现IShape的子类。