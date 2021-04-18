package com.alibaba.rt.thrones.spi.impl;

import com.alibaba.rt.thrones.spi.Fruit;

public class Apple implements Fruit {

    @Override
    public String getColour() {
        return "apple is red";
    }

    @Override
    public String getSize() {
        return "apple is big";
    }
}
