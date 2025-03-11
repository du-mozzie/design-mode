package com.mozzie.creation.prototype;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:49]
 */
public class Test {

    public static void main(String[] args) {
        Product product1 = new Product(2022, 5.28);
        System.out.println(product1);

        // 克隆
        Product product2 = (Product) product1.clone();
        System.out.println(product2);
    }

}
