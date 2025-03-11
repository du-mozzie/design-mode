package com.mozzie.structural.bridge;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [具体的抽象类实现]
 * @Version : [v1.1]
 * @Date : [2022/4/16 21:15]
 */
public class ProductA/*RefinedAbstraction*/ extends Product {

    @Override
    public void operation() {
        color.paint(this.getName());
    }
}
