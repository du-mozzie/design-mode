package com.mozzie.behavioral.responsibility;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 18:08]
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler next) {
        this.successor = next;
    }

    public abstract void handleRequest(int request);
}
