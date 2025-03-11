package com.mozzie.structural.proxy.staticProxy;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [代理对象]
 * @Version : [v1.1]
 * @Date : [2022/4/17 16:31]
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
