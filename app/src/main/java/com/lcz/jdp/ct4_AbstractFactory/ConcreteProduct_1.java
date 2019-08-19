package com.lcz.jdp.ct4_AbstractFactory;

/**
 * desc: 具体产品 - 去实现
 * date: 2019/8/19 14:14 by lcz
 */
public class ConcreteProduct_1 implements Product_1 {
    @Override
    public void show() {
        System.out.println("具体产品 1 - show");
    }
}
