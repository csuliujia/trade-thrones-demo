package com.alibaba.rt.thrones.factory.impl;

import com.alibaba.rt.thrones.factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
