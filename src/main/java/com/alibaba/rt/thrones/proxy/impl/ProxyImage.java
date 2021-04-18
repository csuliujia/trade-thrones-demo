package com.alibaba.rt.thrones.proxy.impl;

import com.alibaba.rt.thrones.proxy.Image;

// ProxyImage 是一个代理类，减少 RealImage 对象加载的内存占用
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
