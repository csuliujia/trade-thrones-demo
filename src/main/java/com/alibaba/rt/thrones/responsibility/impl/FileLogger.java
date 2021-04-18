package com.alibaba.rt.thrones.responsibility.impl;

import com.alibaba.rt.thrones.responsibility.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("file::Logger: " + message);
    }
}
