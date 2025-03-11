package com.mozzie.behavioral.responsibility;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 18:09]
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2 处理请求");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            } else {
                System.out.println("无法处理请求");
            }
        }
    }
}
