package com.mozzie.behavioral.mediator;

import java.time.LocalDateTime;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 22:55]
 */
public class ChatRoom implements Mediator {
    @Override
    public void sendMessage(User source, User target, String msg) {
        System.out.println(LocalDateTime.now() + "\t" + source.getName() + "发送消息：" + msg + " 给" + target.getName());
    }
}
