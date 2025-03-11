package com.mozzie.creation.builder;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [消费者]
 * @Version : [v1.1]
 * @Date : [2022/4/16 10:09]
 */
public class Consumer {

    public static void main(String[] args) {
        Director director = new Director();

        // 调用对应的建造者，创建部件
        Builder builder1 = new ConcreteBuilder1();
        Builder construct1 = director.construct(builder1);
        construct1.getProduct().show();

        // 调用对应的建造者，创建部件
        Builder builder2 = new ConcreteBuilder2();
        Builder construct2 = director.construct(builder2);
        construct2.getProduct().show();
    }

}
