package com.mozzie.behavioral.memento;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/19 1:09]
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("1024");
        caretaker.add(new Memento(originator.getState()));

        originator.setState("2048");
        caretaker.add(new Memento(originator.getState()));

        originator.setState("4096");
        caretaker.add(new Memento(originator.getState()));

        caretaker.showBackup();
        System.out.println("-------------------------------");

        // 恢复备份
        Memento memento = caretaker.getMemento(2);
        if (memento != null){
            caretaker.add(memento);
        }

        caretaker.showBackup();
    }

}
