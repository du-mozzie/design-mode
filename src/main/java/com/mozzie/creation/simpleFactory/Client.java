package com.mozzie.creation.simpleFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [测试类]
 * @Version : [v1.1]
 * @Date : [2022/4/15 22:31]
 */
public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.info();
    }
}
