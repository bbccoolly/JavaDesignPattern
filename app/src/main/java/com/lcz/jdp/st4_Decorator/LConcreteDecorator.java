package com.lcz.jdp.st4_Decorator;

/**
 * desc: 具体装饰角色
 * date: 2019/8/20 15:45 by lcz
 */
public class LConcreteDecorator extends LDecorator {

    public LConcreteDecorator(LComponent component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addFunction();
    }

    private void addFunction() {
        System.out.println("为具体构件角色添加附加功能 - addedFunction()");
    }
}
