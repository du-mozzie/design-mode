package com.mozzie.behavioral.observer;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [具体]
 * @Version : [v1.1]
 * @Date : [2022/4/19 10:33]
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary：" + Integer.toBinaryString(this.subject.getState()).toLowerCase());
    }
}
