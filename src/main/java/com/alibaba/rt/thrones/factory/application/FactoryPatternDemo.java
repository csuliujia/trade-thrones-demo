package com.alibaba.rt.thrones.factory.application;

import com.alibaba.rt.thrones.factory.Shape;
import com.alibaba.rt.thrones.factory.core.ShapeFactory;

//工厂模式
//创建型模式
//使用该工厂，通过传递类型信息来获取实体类的对象
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }


}
