package com.mozzie.behavioral.observer;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [观察者]
 * @Version : [v1.1]
 * @Date : [2022/4/19 10:31]
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
