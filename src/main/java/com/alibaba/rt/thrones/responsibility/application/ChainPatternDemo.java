package com.alibaba.rt.thrones.responsibility.application;

import com.alibaba.rt.thrones.responsibility.AbstractLogger;
import com.alibaba.rt.thrones.responsibility.impl.ConsoleLogger;
import com.alibaba.rt.thrones.responsibility.impl.ErrorLogger;
import com.alibaba.rt.thrones.responsibility.impl.FileLogger;


// 责任链模式
// 行为型模式
// 通常每个接收者都包含对另一个接收者的引用
// 如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推
// 如过滤器、拦截器、打印日志等
// 创建不同类型的记录器，赋予它们不同的错误级别
// 并在每个记录器中设置下一个记录器，每个记录器中的下一个记录器代表的是链的一部分
// 每个记录器判断消息的级别是否属于自己的级别，如果是则相应地打印出来，否则将不打印并把消息传给下一个记录器。
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        //这是errorLogger日志！
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");

        System.out.println("-----------分割线-----------");

        loggerChain.logMessage(AbstractLogger.INFO, "This is an info level information.");

        System.out.println("-----------分割线-----------");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }


}
