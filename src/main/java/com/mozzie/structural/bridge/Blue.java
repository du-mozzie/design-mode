package com.mozzie.structural.bridge;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/16 21:12]
 */
public class Blue/*ConcreteImplementorB*/ implements Color {

    @Override
    public void paint(String name) {
        System.out.println("产品：" + name + "的颜色是蓝色");
    }
}
