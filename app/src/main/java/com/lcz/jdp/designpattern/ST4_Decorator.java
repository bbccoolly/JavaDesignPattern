package com.lcz.jdp.designpattern;

import com.lcz.jdp.st4_Decorator.LComponent;
import com.lcz.jdp.st4_Decorator.LConcreteComponent;
import com.lcz.jdp.st4_Decorator.LConcreteDecorator;

/**
 * desc: 装饰模式 - 在不改变原有对象结构的情况下，动态地给对象增加额外功能
 * date: 2019/8/19 15:25 by lcz
 */
public class ST4_Decorator {

    /**
     * 1. 优点：
     *  - 扩展对象的功能比继承更灵活
     *  - 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合
     * 2. 缺点：
     *  - 子类过多，程序复杂
     * */

    /**
     * 2. 结构：
     * -1. 抽象构件(Component) 角色：定义一个抽象接口以规范准备接收附加责任对象
     * -2. 具体构件(Concrete Component) 角色：实现抽象构建，通过装饰角色为其添加一些职责
     * -3. 抽象装饰(Decorator) 角色：继承抽象构件，并包含具体构件的实例，通过其子类扩展具体构件功能
     * -4. 具体装饰(Component Decorator) 角色：实现抽象装饰的相关方法，并给具体构件对象添加附加责任
     */

    /**
     * 3. 应用场景：
     *  -1. 现有类添加附加功能，又不能采用生成子类的方法进行扩充时。eg：该类被隐藏、该类是终极类、继承会产生大量子类
     *  -2. 对象的功能可以动态的添加、撤销
     *
     * */

    /**
     * 4. 扩展
     *  -1. 如果只有一个具体构件没有抽象构件时，可以让抽象装饰继承具体构件
     *  -2. 如果只有一个具体装饰时，可以将抽象装饰和具体装饰合并
     *
     * */

    public static void main(String[] args) {
        LComponent component = new LConcreteComponent();
        component.operation();
        System.out.println("-----------------------");
        LComponent d = new LConcreteDecorator(component);
        d.operation();
    }

}
