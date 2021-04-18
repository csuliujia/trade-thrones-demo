package com.alibaba.rt.thrones.responsibility.impl;

import com.alibaba.rt.thrones.responsibility.AbstractLogger;

//创建扩展了该记录器类的实体类
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("console::Logger: " + message);
    }
}
