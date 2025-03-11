package com.mozzie.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/19 10:36]
 */
public class Subject {

    private List<Observer> observers;
    private int state;

    public Subject(){
        this.observers = new ArrayList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            iterator.next().update();
        }
    }

}
