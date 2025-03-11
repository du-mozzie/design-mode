package com.mozzie.behavioral.iterator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 22:07]
 */
public class IteratorPatternDemo {

    private static String[] bookNames = {"数据结构与算法", "Java编程思想", "重学Java设计模式", "算法导论"};

    public static void main(String[] args) {
        BookAggregate bookAggregate = new BookAggregate();

        for (int i = 0; i < bookNames.length; i++) {
            bookAggregate.addBook(new Book(bookNames[i]));
        }
        Iterator iterator = bookAggregate.createIterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }

}
