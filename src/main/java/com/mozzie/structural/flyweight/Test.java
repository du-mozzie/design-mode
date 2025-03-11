package com.mozzie.structural.flyweight;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 15:42]
 */
public class Test {

    private static final String[] COlOR = {"Red", "Green", "Yellow", "Blue", "White"};

    public static void main(String[] args) {
        // 随机画20个圆
        for (int i = 0; i < 20; i++) {
            Circle circle = FlyWeightFactory.getCircle(getColor());
            circle.setX(getX());
            circle.setY(getY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    // 随机x坐标，0~100
    public static int getX() {
        return (int) (Math.random() * 100);
    }

    // 随机y坐标
    public static int getY() {
        return (int) (Math.random() * 100);
    }

    // 随机颜色
    public static String getColor() {
        return COlOR[(int) (Math.random() * COlOR.length)];
    }
}
