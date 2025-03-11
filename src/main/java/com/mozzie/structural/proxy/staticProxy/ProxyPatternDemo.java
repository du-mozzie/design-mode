package com.mozzie.structural.proxy.staticProxy;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 16:33]
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        // 创建的代理对象
        Image proxyImage = new ProxyImage("test.jpg");
        // 当realImage不存在时，proxyImage会调用realImage的构造方法创建对象，调用加载图片到磁盘
        proxyImage.display();

        System.out.println("---------------");

        // 当realImage存在时，proxyImage直接代理了对象
        proxyImage.display();
    }

}
