package com.mozzie.behavioral.mediator;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 22:52]
 */
public interface Mediator {

    void sendMessage(User source,User target, String msg);

}
