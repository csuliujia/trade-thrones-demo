package com.alibaba.rt.thrones.template.impl;

import com.alibaba.rt.thrones.template.AbstractGame;

public class Football extends AbstractGame {

    @Override
    public void initialize() {
        System.out.println("football game initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("football game started!");
    }

    @Override
    public void endPlay() {
        System.out.println("football game finished!");
    }
}
