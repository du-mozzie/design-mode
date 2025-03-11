package com.mozzie.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 22:10]
 */
public class BookAggregate implements Aggregate{

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public Object getBook(int index){
        return books.get(index);
    }

    public int getSize(){
        return books.size();
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(this);
    }
}
