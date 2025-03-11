package com.mozzie.creation.builder;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [抽象建造者]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:03]
 */
abstract class Builder {

    public abstract void buildPart();

    public abstract Product getProduct();

}
