package com.mozzie.structural.decorator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 10:19]
 */
public class Test {

    public static void main(String[] args) {
        Person student = new Student("张三");
        student.operation();

        System.out.println("------------------");

        student = new ConcreteDecoratorA(student);
        student = new ConcreteDecoratorB(student);
        student.operation();

        System.out.println("------------------");

        // 对象链写法
        Person student2 = new ConcreteDecoratorB(new ConcreteDecoratorA(new Student("李四")));
        student2.operation();
    }
}