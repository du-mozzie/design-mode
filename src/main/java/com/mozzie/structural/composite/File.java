package com.mozzie.structural.composite;

import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 9:01]
 */
public class File/*Leaf*/ extends AbstractFile {

    public File(String name) {
        this.name = name;
    }

    @Override
    public boolean add(AbstractFile file) {
        return false;
    }

    @Override
    public boolean remove(AbstractFile file) {
        return false;
    }

    @Override
    public List<AbstractFile> getChildCList() {
        return null;
    }
}
