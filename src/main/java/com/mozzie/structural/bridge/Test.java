package com.mozzie.structural.bridge;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/16 21:24]
 */
public class Test {

    public static void main(String[] args) {
        ProductA productA = new ProductA();
        productA.setName("productA");

        Red red = new Red();
        productA.setColor(red);

        productA.operation();
    }
}
