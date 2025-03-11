package com.mozzie.behavioral.strategy;

/**
 * @author : Du YingJie (2548425238@qq.com)
 * @version : [v1.1]
 * @description : [一句话描述这个类的作用]
 * @date : [2023/1/29 11:57]
 */
public class OperationDiv implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}