package com.mozzie.creation.simpleFactory;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [简单工厂模式]
 * @Version : [v1.1]
 * @Date : [2022/4/15 22:20]
 */
public class SimpleFactory {

    public static Product createProduct(String type) {
        Product product = null;
        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                System.out.println("没有 " + type + " 类型的产品");
                break;
        }
        return product;
    }
}
