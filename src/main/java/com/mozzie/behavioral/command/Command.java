package com.mozzie.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 8:38]
 */
public class Command {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void executeOrder(){
        orderList.forEach(Order::execute);
    }
}
