package com.lcz.jdp.ct5_Builder;

/**
 * desc: 指挥者，调用建造者中的方法完成对象创建
 * date: 2019/8/19 14:57 by lcz
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getResult();
    }
}
