package com.mozzie.behavioral.memento;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [备忘录]
 * @Version : [v1.1]
 * @Date : [2022/4/19 1:09]
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
