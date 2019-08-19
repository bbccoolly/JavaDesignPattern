package com.lcz.jdp.ct3_FactoryMethod;

/**
 * desc: TODO
 * date: 2019/8/19 10:59 by lcz
 */
public class ConcreteFactory_2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct_2();
    }
}
