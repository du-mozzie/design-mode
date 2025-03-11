package com.mozzie.structural.decorator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 11:02]
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Person person) {
        this.person = person;
    }

    @Override
    public void operation() {
        // 原本的职责
        person.operation();
        // 具体的装饰器的职责
        System.out.println(person.name + "：写代码");
    }
}
