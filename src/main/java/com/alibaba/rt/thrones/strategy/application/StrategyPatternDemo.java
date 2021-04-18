package com.alibaba.rt.thrones.strategy.application;

import com.alibaba.rt.thrones.strategy.core.Context;
import com.alibaba.rt.thrones.strategy.impl.OperationAdd;
import com.alibaba.rt.thrones.strategy.impl.OperationSubtract;


//策略模式
//行为型模式
//一个类的行为可以在运行时更改
//context对象：行为随着策略对象改变而改变
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }



}
