package com.alibaba.rt.thrones.proxy.impl;

import com.alibaba.rt.thrones.proxy.Image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

}