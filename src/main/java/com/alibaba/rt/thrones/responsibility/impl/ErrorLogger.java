package com.alibaba.rt.thrones.responsibility.impl;

import com.alibaba.rt.thrones.responsibility.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("error::Logger: " + message);
    }
}
