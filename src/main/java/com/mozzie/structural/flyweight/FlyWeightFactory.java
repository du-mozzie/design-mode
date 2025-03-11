package com.mozzie.structural.flyweight;

import java.util.HashMap;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [享元工厂，创建对象]
 * @Version : [v1.1]
 * @Date : [2022/4/17 15:34]
 */
public class FlyWeightFactory {

    private static final HashMap<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = (Circle) CIRCLE_MAP.get(color);
        if (circle == null) {
            circle = new Circle(color);
            System.out.println("创建了一个新的圆，颜色是：" + color);
            CIRCLE_MAP.put(color, circle);
        }
        return circle;
    }
}
