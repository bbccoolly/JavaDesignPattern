package com.lcz.jdp.st4_Decorator;

/**
 * desc: 抽象装饰角色
 * date: 2019/8/20 15:44 by lcz
 */
public class LDecorator implements LComponent {

    private LComponent component;

    public LDecorator(LComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
