package com.mozzie.structural.composite;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/17 9:08]
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Folder root = new Folder("root");

        AbstractFile folderA = new Folder("folderA");
        AbstractFile fileA = new File("fileA");

        root.add(folderA);
        root.add(fileA);

        AbstractFile fileB = new File("fileB");
        AbstractFile fileC = new File("fileC");
        folderA.add(fileB);
        folderA.add(fileC);
        
        AbstractFile.printChildrenNames(root);
    }
}
