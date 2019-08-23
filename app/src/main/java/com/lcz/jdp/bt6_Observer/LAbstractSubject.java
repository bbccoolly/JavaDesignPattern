package com.lcz.jdp.bt6_Observer;


import java.util.ArrayList;
import java.util.List;

/**
 * desc: 抽象主题 - 提供保存观察者对象的聚集类，添加删除观察者对象的方法，以及通知所有观察者的抽象方法
 * date: 2019/8/23 17:26 by lcz
 */
public abstract class LAbstractSubject {


    /*保存观察者对象的聚集类*/
    protected List<LAbstractObserver> observers = new ArrayList<>();

    /**
     * @param observer 添加 观察者 的方法
     */
    public void addObserver(LAbstractObserver observer) {
        observers.add(observer);
    }


    /**
     * @param observer 删除 观察者 的方法
     */
    public void delObserver(LAbstractObserver observer) {
        observers.remove(observer);
    }

    //通知 观察者 方法
    public abstract void notifyObserver();
}
