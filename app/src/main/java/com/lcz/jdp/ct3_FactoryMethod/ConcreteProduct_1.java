package com.lcz.jdp.ct3_FactoryMethod;

/**
 * desc: 具体产品 1- 实现抽象产品中的抽象方法
 * date: 2019/8/19 10:56 by lcz
 */
public class ConcreteProduct_1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品 - 1 show");
    }
}
