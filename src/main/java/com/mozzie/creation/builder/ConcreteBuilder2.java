package com.mozzie.creation.builder;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [建造者2]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:17]
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPart() {
        product.add("A");
        product.add("B");
        product.add("C");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
