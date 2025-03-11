package com.mozzie.creation.singleton;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [懒汉单例模式]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:55]
 */
public class Lazy {

    private int year = 2022;

    public static Lazy lazy = null;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println("year = " + year);
    }
}
