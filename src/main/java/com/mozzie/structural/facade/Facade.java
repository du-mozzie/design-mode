package com.mozzie.structural.facade;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [外观模式]
 * @Version : [v1.1]
 * @Date : [2022/4/17 14:46]
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodOne() {
        subSystemOne.methodOne();
    }

    public void methodTwo() {
        subSystemTwo.methodTwo();
    }

    public void methodThree() {
        subSystemThree.methodThree();
    }
}