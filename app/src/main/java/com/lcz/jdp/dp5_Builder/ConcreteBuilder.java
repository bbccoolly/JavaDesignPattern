package com.lcz.jdp.dp5_Builder;

/**
 * desc: 具体建造者，实现接口，完成具体创建(复杂产品各个部件的具体创建方法)
 * date: 2019/8/19 14:53 by lcz
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
