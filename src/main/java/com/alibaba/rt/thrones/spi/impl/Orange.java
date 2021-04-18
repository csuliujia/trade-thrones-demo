package com.alibaba.rt.thrones.spi.impl;

import com.alibaba.rt.thrones.spi.Fruit;

public class Orange implements Fruit {

    @Override
    public String getColour() {
        return "orange is orange";
    }

    @Override
    public String getSize() {
        return "orange is small";
    }
}
