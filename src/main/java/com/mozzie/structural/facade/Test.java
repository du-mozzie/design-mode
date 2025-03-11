package com.mozzie.structural.facade;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 14:50]
 */
public class Test {

    public static void main(String[] args) {
        // 通过访问外观类的方法，可以访问子系统的方法
        Facade facade = new Facade();
        facade.methodOne();
        facade.methodTwo();
        facade.methodThree();
    }
}
