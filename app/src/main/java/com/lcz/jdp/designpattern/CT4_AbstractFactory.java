package com.lcz.jdp.designpattern;

/**
 * desc: 抽象工厂模式 -
 *  1. 工厂方法模式只考虑生产同等级产品，比如大学既有软件专业又有生物专业
 *  2. 抽象工厂模式考虑多等级产品的生产
 * date: 2019/8/19 11:29 by lcz
 */
public class CT4_AbstractFactory {
    /**
     * 1. 定义：
     *  - 是一种为访问类提供一个创建一组相关或相互依赖对象的接口，
     *  - 且访问类无需指定所需产品的具体类就能得到同族的不同等级的产品的模式结构
     * 2. 特点：
     *  - 是工厂方法模式的升级版，可生产多个等级的产品
     */

    /**
     * 2. 优点：
     *  - 1. 对产品族中相关联的多等级产品共同管理，
     *  - 2. 遵循 OCP
     * 3. 缺点：
     *  - 1. 当产品族中新增一个产品时，所有的工厂都需要进行修改
     */

    /**
     * 4. 结构：
     *  - 1. 抽象工厂
     *  - 2. 具体工厂
     *  - 3. 抽象产品
     *  - 4. 具体产品
     *
     */
}
