package com.mozzie.behavioral.strategy;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/20 0:24]
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy operationAdd = new OperationAdd();
        context.setStrategy(operationAdd);
        System.out.println("加法：" + context.operation(10, 20));

        Strategy operationSub = new OperationSub();
        context.setStrategy(operationSub);
        System.out.println("减法：" + context.operation(10, 20));

        Strategy operationMul = new OperationMul();
        context.setStrategy(operationMul);
        System.out.println("乘法：" + context.operation(10, 20));

        Strategy operationDiv = new OperationDiv();
        context.setStrategy(operationDiv);
        System.out.println("除法：" + context.operation(10, 20));
    }
}