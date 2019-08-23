package com.lcz.jdp.bt6_Observer;

/**
 * desc: 具体观察者 - 实现抽象观察者中的抽象方法，
 * date: 2019/8/23 17:39 by lcz
 */
public class LConcreteObserver_1 implements LAbstractObserver {
    @Override
    public void response() {
        System.out.println("具体观察者 1 作出反应");
    }
}
