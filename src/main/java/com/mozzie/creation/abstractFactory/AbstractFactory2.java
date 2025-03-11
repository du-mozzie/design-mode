package com.mozzie.creation.abstractFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [工厂具体实现类]
 * @Version : [v1.1]
 * @Date : [2022/4/16 9:30]
 */
public class AbstractFactory2 implements AbstractFactory {

    // 创建产品A2
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    // 创建产品B2
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
