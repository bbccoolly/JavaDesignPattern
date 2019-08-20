package com.lcz.jdp.st2_Adapter;

/**
 * desc: 对象适配器
 * date: 2019/8/20 12:11 by lcz
 */
public class ObjectAdapter implements LTarget{

    private LAdaptee adaptee;

    public ObjectAdapter(LAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void Request() {
        adaptee.specificRequest();
    }
}
