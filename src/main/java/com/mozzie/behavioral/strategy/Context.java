package com.mozzie.behavioral.strategy;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/20 0:23]
 */
public class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public int operation(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}