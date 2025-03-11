package com.mozzie.behavioral.memento;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [原发器]
 * @Version : [v1.1]
 * @Date : [2022/4/19 1:05]
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public Memento createMemento(){
        return new Memento(state);
    }

}
