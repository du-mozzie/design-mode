package com.mozzie.structural.decorator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [具体的装饰器A]
 * @Version : [v1.1]
 * @Date : [2022/4/17 10:32]
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Person person) {
        this.person = person;
    }

    @Override
    public void operation() {
        // 原本的职责
        person.operation();
        // 具体的装饰器的职责
        System.out.println(person.name + "：写作业");
    }
}
