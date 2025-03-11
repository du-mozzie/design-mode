package com.mozzie.creation.abstractFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [抽象工厂]
 * @Version : [v1.1]
 * @Date : [2022/4/16 9:10]
 */
public interface AbstractFactory {

    // 创建产品A
    public AbstractProductA createProductA();

    // 创建产品B
    public AbstractProductB createProductB();
}
