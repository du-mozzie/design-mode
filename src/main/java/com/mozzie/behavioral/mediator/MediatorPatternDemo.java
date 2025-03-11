package com.mozzie.behavioral.mediator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 22:59]
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User du = new User("Du", chatRoom);
        User jack = new User("jack", chatRoom);

        du.sendMessage(jack, "hello");
    }
}
