package com.mozzie.behavioral.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [管理者]
 * @Version : [v1.1]
 * @Date : [2022/4/19 1:09]
 */
public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        if (index > 1 && index < mementos.size()) {
            return mementos.get(index - 1);
        }
        return null;
    }

    public void showBackup() {
        int num = 1;
        Iterator<Memento> iterator = mementos.iterator();
        while (iterator.hasNext()) {
            System.out.println("第" + num + "次备份，状态为：" + iterator.next().getState());
            num++;
        }
    }

}
