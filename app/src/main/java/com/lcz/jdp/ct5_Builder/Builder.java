package com.lcz.jdp.ct5_Builder;

/**
 * desc: 抽象建造者，包含创建各个产品子部件的抽象方法、接口，以及返回产品对象的 getResult()
 * date: 2019/8/19 14:39 by lcz
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象

    public Product getResult() {
        return product;
    }
}
