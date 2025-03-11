package com.mozzie.creation.factory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/15 23:39]
 */
public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
