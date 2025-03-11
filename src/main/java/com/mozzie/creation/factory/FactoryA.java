package com.mozzie.creation.factory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [实现工厂接口 创建具体的产品]
 * @Version : [v1.1]
 * @Date : [2022/4/15 23:35]
 */
public class FactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
