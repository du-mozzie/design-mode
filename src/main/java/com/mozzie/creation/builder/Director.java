package com.mozzie.creation.builder;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [管理者]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:17]
 */
public class Director {
    public Builder construct(Builder builder) {
        builder.buildPart();
        return builder;
    }
}
