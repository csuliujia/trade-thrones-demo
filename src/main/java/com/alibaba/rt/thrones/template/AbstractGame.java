package com.alibaba.rt.thrones.template;

public abstract class AbstractGame {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //忽略
    private void test() {

    }

    //模版方法，设置为final类型，接口中方法实现必须为default默认类型
    //接口中default默认方法不能为final，所以未使用接口
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

}
