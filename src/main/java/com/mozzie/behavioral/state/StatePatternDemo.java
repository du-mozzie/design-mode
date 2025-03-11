package com.mozzie.behavioral.state;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/19 23:34]
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(startState);

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(stopState);
    }

}
