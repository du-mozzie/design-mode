package com.mozzie.behavioral.interpreter;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [解释器接口]
 * @Version : [v1.1]
 * @Date : [2022/4/18 9:17]
 */
public interface Expression {

    public boolean interpret(String context);

}
