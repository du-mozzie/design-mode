package com.mozzie.creation.singleton;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [饿汉单例模式]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:56]
 */
public class Hungry {

    private int year = 2022;

    public static Hungry hungry = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return hungry;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println("year = " + year);
    }
}
