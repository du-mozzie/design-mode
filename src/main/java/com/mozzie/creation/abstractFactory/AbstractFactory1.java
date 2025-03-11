package com.mozzie.creation.abstractFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [工厂具体实现类]
 * @Version : [v1.1]
 * @Date : [2022/4/16 9:29]
 */
public class AbstractFactory1 implements AbstractFactory {

    // 创建产品A1
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    // 创建产品B1
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
