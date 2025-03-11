package com.mozzie.structural.flyweight;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [实现接口的实体类]
 * @Version : [v1.1]
 * @Date : [2022/4/17 15:31]
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("画了一个圆：x-" + x + "，y-" + y + "，半径-" + radius + "，颜色-" + color);
    }
}
