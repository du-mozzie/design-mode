package com.mozzie.behavioral.command;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 8:46]
 */
public class CommandPattern {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Command command = new Command();

        Order buyOrder = new BuyOrder(stock);
        Order sellOrder = new SellOrder(stock);

        command.addOrder(buyOrder);
        command.addOrder(sellOrder);

        // 执行命令
        command.executeOrder();
    }
}
