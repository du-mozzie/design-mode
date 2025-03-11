package com.mozzie.structural.composite;

import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 9:00]
 */
public abstract class AbstractFile /*Component*/ {
    protected String name;

    public void printName()/*operation*/ {
        System.out.println(name);
    }

    static void printChildrenNames(AbstractFile root) {
        root.printName();
        List<AbstractFile> children = root.getChildCList();
        if (children == null) return;
        for (AbstractFile child : children) {
            printChildrenNames(child);
        }
    }

    public abstract boolean add(AbstractFile file);

    public abstract boolean remove(AbstractFile file);

    public abstract List<AbstractFile> getChildCList();
}
