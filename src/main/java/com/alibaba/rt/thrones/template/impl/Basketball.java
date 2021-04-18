package com.alibaba.rt.thrones.template.impl;

import com.alibaba.rt.thrones.template.AbstractGame;

public class Basketball extends AbstractGame {

    @Override
    public void initialize() {
        System.out.println("basketball game initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("basketball game started!");
    }

    @Override
    public void endPlay() {
        System.out.println("basketball game finished!");
    }
}
