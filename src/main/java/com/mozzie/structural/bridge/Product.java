package com.mozzie.structural.bridge;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [抽象类接口]
 * @Version : [v1.1]
 * @Date : [2022/4/16 21:10]
 */
public abstract class Product/*Abstraction*/ {
    private String name;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void operation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
