package com.alibaba.rt.thrones.proxy.application;

import com.alibaba.rt.thrones.proxy.Image;
import com.alibaba.rt.thrones.proxy.impl.ProxyImage;


// 代理模式
// 结构型模式
// 创建具有现有对象的对象，以便向外界提供功能接口
public class ProxyPatternDemo {

    // 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }

}
