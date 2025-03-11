package com.mozzie.creation.abstractFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [客户端]
 * @Version : [v1.1]
 * @Date : [2022/4/16 9:31]
 */
public class Client {

    public static void main(String[] args) {
        // 需要哪一个产品就调用对应的产品工厂来创建
        // 创建产品A1
        AbstractFactory1 factory1 = new AbstractFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        productA1.info();

        // 创建产品B2
        AbstractFactory2 factory2 = new AbstractFactory2();
        AbstractProductB productB2 = factory2.createProductB();
        productB2.info();
    }
}
