package com.mozzie.behavioral.iterator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 22:09]
 */
public class BookIterator implements Iterator{

    private int index = 0;
    private BookAggregate bookAggregate;

    public BookIterator(BookAggregate bookAggregate) {
        this.bookAggregate = bookAggregate;
    }

    @Override
    public boolean hasNext() {
        if (index < bookAggregate.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object book = bookAggregate.getBook(index);
        index++;
        return book;
    }
}
