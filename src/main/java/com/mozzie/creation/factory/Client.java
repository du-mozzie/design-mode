package com.mozzie.creation.factory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [测试类]
 * @Version : [v1.1]
 * @Date : [2022/4/15 23:38]
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 需要产品A就调用对应的工厂类
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();

        // 需要产品B就调用对应的工厂类
        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info();

    }
}
