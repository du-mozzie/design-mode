package com.mozzie.behavioral.responsibility;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 18:13]
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandler3 处理请求 " + request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            } else {
                System.out.println("无法处理请求");
            }
        }
    }
}
