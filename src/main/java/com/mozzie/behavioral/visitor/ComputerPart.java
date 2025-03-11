package com.mozzie.behavioral.visitor;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/20 0:40]
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}