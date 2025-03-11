package com.mozzie.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [产品]
 * @Version : [v1.1]
 * @Date : [2022/4/16 9:58]
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建完毕！");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}