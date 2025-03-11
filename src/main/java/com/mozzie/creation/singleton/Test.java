package com.mozzie.creation.singleton;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:58]
 */
public class Test {

    public static void main(String[] args) {
        // 饿汉单例，在编译的时候直接创建了对象
        System.out.println(Hungry.hungry);
        Hungry hungry = Hungry.getInstance();
        hungry.print();

        Hungry hungry1 = Hungry.getInstance();
        hungry1.setYear(2020);

        // 同一个实例
        hungry.print();
        hungry1.print();

        // 懒汉单例，在调用的时候才会创建对象
        System.out.println(Lazy.lazy);
        Lazy lazy = Lazy.getInstance();
        System.out.println(Lazy.lazy);
        lazy.print();

        Lazy lazy1 = Lazy.getInstance();
        lazy1.setYear(2020);

        // 同一个实例
        lazy.print();
        lazy1.print();
    }
}
