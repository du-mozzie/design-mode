package com.mozzie.structural.decorator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 10:15]
 */
public class Student/*ConcreteComponent*/ extends Person {

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + "的职责：学习");
    }
}
