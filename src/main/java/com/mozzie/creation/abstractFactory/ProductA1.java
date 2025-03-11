package com.mozzie.creation.abstractFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [抽象产品A 具体实现A1]
 * @Version : [v1.1]
 * @Date : [2022/4/16 9:20]
 */
public class ProductA1 implements AbstractProductA {

    @Override
    public void info() {
        System.out.println("I am ProductA1");
    }
}
