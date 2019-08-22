package com.lcz.jdp.bt1_TemplateMethod;

/**
 * desc: 具体子类 - 实现抽象类中的方法
 * date: 2019/8/22 10:51 by lcz
 */
public class LConcreteClass extends LAbstractClass {
    @Override
    public void AbstractMethod_1() {
        System.out.println("抽象类中的抽象方法 1 被调用");
    }

    @Override
    public void AbstractMethod_2() {
        System.out.println("抽象类中的抽象方法 2 被调用");
    }

    @Override
    public void HookMethod_1() {
        System.out.println("钩子方法 1 被重写");
    }

    @Override
    public boolean HookMethod_2() {
        return false;
    }
}
