package com.alibaba.rt.thrones.factory.core;

import com.alibaba.rt.thrones.factory.Shape;
import com.alibaba.rt.thrones.factory.impl.Circle;
import com.alibaba.rt.thrones.factory.impl.Rectangle;
import com.alibaba.rt.thrones.factory.impl.Square;

import java.util.Objects;

//创建一个工厂类，生成基于给定信息的实体类的对象
//主要解决接口的选择问题
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(Objects.isNull(shapeType)){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
     return null;
    }
}
