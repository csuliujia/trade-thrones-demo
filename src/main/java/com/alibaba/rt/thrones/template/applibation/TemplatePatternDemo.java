package com.alibaba.rt.thrones.template.applibation;

import com.alibaba.rt.thrones.template.AbstractGame;
import com.alibaba.rt.thrones.template.impl.Basketball;
import com.alibaba.rt.thrones.template.impl.Football;


//模版模式
//行为型模式
//一个抽象类公开定义了执行它的方法的方式/模版
//它的子类可以按需要重写方法实现，但调用将以抽象类中定义方式进行
//使用AbstractGame的模版方法play()来演示游戏的定义方式
public class TemplatePatternDemo {
    public static void main(String[] args) {
        AbstractGame abstractGame = new Basketball();
        abstractGame.play();

        abstractGame = new Football();
        abstractGame.play();
    }
}
