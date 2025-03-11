package com.mozzie.structural.adapter;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/16 20:32]
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
