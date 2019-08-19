package com.lcz.jdp.ct4_AbstractFactory;

/**
 * desc: 具体工厂 - 实现产品的方法
 * date: 2019/8/19 14:12 by lcz
 */
public class ConcreteFactory_1 implements AbstractFactory {
    @Override
    public Product_1 newProduct_1() {
        return new ConcreteProduct_1();
    }

    @Override
    public Product_2 newProduct_2() {
        return new ConcreteProduct_2();
    }
}
