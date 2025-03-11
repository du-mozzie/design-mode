package com.mozzie.behavioral.responsibility;

/**
 * 责任链
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 18:12]
 */
public class Test {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.handleRequest(5); // 处理请求
        handler1.handleRequest(10); // 处理请求
        handler1.handleRequest(25); // 处理请求
    }
}
