package com.lcz.jdp.bt6_Observer;

/**
 * desc: 具体主题 - 实现抽象主题 中的通知方法
 * date: 2019/8/23 17:34 by lcz
 */
public class LConcreteSubject extends LAbstractSubject {

    @Override
    public void notifyObserver() {
        System.out.println("具体主题 - 发生改变");

        for (Object obs : observers) {
            ((LAbstractObserver) obs).response();

        }
    }
}
