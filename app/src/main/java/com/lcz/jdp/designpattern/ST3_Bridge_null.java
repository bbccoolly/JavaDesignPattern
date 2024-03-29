package com.lcz.jdp.designpattern;

/**
 * desc: 桥接模式 - 将抽象与现实分离，使他们可以独立变化。不同颜色和字体的文字，不同性别和职业的男女
 *  - 用组合关系替代继承关系，降低抽象与现实这两个可变维度的耦合度
 * date: 2019/8/19 15:25 by lcz
 */
public class ST3_Bridge_null {

    /**
     * 1. 优点：
     *  -1. 抽象和现实分离，扩展能力强
     *  -2. 其实现细节对客户透明
     * 2. 缺点：
     *  -1. 聚合关系是建立在抽象层，要求开发者针对抽象化进行设计与编程，增加了系统理解和设计的难度
     * */

    /**
     * 3. 桥接模式的结构：
     *  -1. 抽象化(Abstraction) 角色：定义抽象类，且包含一个对实现化对象的引用
     *  -2. 扩展抽象化(Refined Abstraction) 角色：是抽象化的子类，实现父类中的业务方法，并通过组合关系调用实现化中的业务方法
     *  -3. 实现化(Abstraction) 角色：定义实现化角色的接口，供扩展抽象化角色调用
     *  -4. 具体实现化(Abstraction) 角色：实现化角色接口的具体实现
     *
     *
     * */
}
