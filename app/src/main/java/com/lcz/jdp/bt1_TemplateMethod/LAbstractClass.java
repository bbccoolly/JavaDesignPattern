package com.lcz.jdp.bt1_TemplateMethod;

/**
 * desc: 抽象类 - 轮廓和骨架
 * date: 2019/8/21 16:34 by lcz
 */
public abstract class LAbstractClass {

    /**
     * 模板方法
     */
    public void TemplateMethod() {
        Method_1();
        AbstractMethod_1();
        AbstractMethod_2();

        HookMethod_1();
        if (HookMethod_2()) {
            SpecificMethod();
        }

    }

    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法 SpecificMethod 被调用 - ");

    }

    /**
     * @return 钩子方法 2
     */
    public boolean HookMethod_2() {
        return true;
    }

    /**
     * 钩子方法 1
     */
    public void HookMethod_1() {

    }

    /*抽象方法 1 */
    public abstract void AbstractMethod_1();

    /*抽象方法 2 */
    public abstract void AbstractMethod_2();

    /**
     * 具体方法 1
     */
    public void Method_1() {
        System.out.println("抽象类中的具体方法 1 被调用");
    }

}


