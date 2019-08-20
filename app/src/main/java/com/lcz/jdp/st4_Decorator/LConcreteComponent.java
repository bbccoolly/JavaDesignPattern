package com.lcz.jdp.st4_Decorator;

/**
 * desc: 具体构件，实现抽象构件
 * date: 2019/8/20 15:42 by lcz
 */
public class LConcreteComponent implements LComponent{

    public LConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法 operation() ");
    }
}
