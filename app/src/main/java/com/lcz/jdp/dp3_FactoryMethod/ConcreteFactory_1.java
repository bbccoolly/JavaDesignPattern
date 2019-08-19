package com.lcz.jdp.dp3_FactoryMethod;

/**
 * desc: 具体工厂 - 实现了产品的 show 方法，(具体实现)
 * date: 2019/8/19 10:54 by lcz
 */
public class ConcreteFactory_1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct_1();
    }
}
