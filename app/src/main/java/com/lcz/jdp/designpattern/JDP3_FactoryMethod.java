package com.lcz.jdp.designpattern;

import com.lcz.jdp.dp1_FactoryMethod.AbstractFactory;
import com.lcz.jdp.dp1_FactoryMethod.Product;
import com.lcz.jdp.dp1_FactoryMethod.ReadXML1;

/**
 * desc: 3. 工厂方法模式 -
 * 1. 定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂中
 * 2. 满足创建与使用分离
 * date: 2019/8/16 15:11 by lcz
 */
public class JDP3_FactoryMethod {
    /**
     * 1. 优点：
     *   - 用户只需知道具体工厂的名称就可得到所要的产品，无需知道产品的具体创建过程
     *   - 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无需对原工厂进行任何修改，满足 OCP
     * 2. 缺点：
     *   - 增加了系统复杂度
     */


    /**
     * 模式的结构与实现：
     * - 工厂方法模式具体由，抽象工厂，具体工厂，抽象产品，具体产品 4 个要素组成
     * 1. 抽象工厂(Abstract Factory):提供创建产品的接口，调用者通过他的 newProduct() 来创建产品
     * 2. 具体工厂(Concrete Factory):实现抽象工厂中的抽象方法，完成具体产品创建
     * 3. 抽象产品(Product):定义产品规范，描述产品的所有特性、功能
     * 4. 具体产品(Concrete Product):实现抽象产品定义的所有接口，由具体工厂来创建
     */

    public static void main(String[] args) {
        Product p;
        AbstractFactory af;
        af = (AbstractFactory) ReadXML1.getObject();
        assert af != null;
        p = af.newProduct();
        p.show();
    }
}

