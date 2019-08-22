package com.lcz.jdp.designpattern;

import com.lcz.jdp.bt1_TemplateMethod.LAbstractClass;
import com.lcz.jdp.bt1_TemplateMethod.LConcreteClass;

/**
 * desc: 模板方法模式 - 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
 *  子类可以不改变该算法结构的情况下，重新定义该算法的某些特定步骤
 * date: 2019/8/21 11:12 by lcz
 */
public class BT1_TemplateMethod {

    /**
     * 1. 优点：
     *  -1. 封装不变部分，扩展可变部分
     *  -2. 提取父类中的公共部分代码。便于代码复用
     *  -3. 部分方法由子类实现，符合 OCP
     *
     * 2. 缺点：
     *  -1. 对每个不同的实现，都需要定义一个子类
     *  -2. 子类实现父类中的抽象方法，子类的执行结果会反向控制影响父类的结果
     * */

    /**
     * 3. 结构：
     * -1. 抽象类(Abstract Class)：负责给出一个算法的轮廓和骨架。由一个模板方法和若干个基本方法组成
     * - 模板方法：定义了算法的骨架
     * - 基本方法：是整个算法的一个步骤
     * -1. 抽象方法：在抽象类中声明，
     * -2. 具体方法；在抽象类中已经实现，在具体子类中可以继承或重写它
     * -3. 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种
     * -2. 具体子类(Concrete Class)：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤
     */

    /**4. 应用场景
     *  -1. 算法的整体步骤很固定，对于个别易变的部分可以使用模板方法模式，将易变的部分抽出来，供子类调用
     *  -2. 多个子类存在公共的行为时，将其提取出来集中到一个公共父类中，以避免代码重复
     *  -3. 需要控制子类的扩展时，模板方法只在特定点调用钩子操作，只允许在这些点进行扩展
     * */

    public static void main(String[] args) {
        LAbstractClass abstractClass = new LConcreteClass();
        abstractClass.TemplateMethod();
    }
}
