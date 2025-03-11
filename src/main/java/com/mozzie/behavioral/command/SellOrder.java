package com.mozzie.behavioral.command;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/4/18 8:37]
 */
public class SellOrder implements Order {

    private Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
