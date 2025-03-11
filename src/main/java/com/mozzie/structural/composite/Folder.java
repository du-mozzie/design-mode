package com.mozzie.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 9:02]
 */
public class Folder/*Composite*/ extends AbstractFile {

    private List<AbstractFile> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public boolean add(AbstractFile file) {
        return children.add(file);
    }

    @Override
    public boolean remove(AbstractFile file) {
        return children.remove(file);
    }

    @Override
    public List<AbstractFile> getChildCList() {
        return children;
    }
}