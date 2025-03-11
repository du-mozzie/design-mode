package com.mozzie.creation.prototype;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:43]
 */
public class Product implements Prototype /*extends Cloneable*/ {
    private int id;
    private double price;

    public Product() {
    }

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone() {
        Product obj = new Product();
        obj.id = this.id;
        obj.price = this.price;
        return obj;
    }
}
