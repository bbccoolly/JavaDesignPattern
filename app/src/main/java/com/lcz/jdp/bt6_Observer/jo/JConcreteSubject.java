package com.lcz.jdp.bt6_Observer.jo;

import java.util.Observable;

/**
 * desc: 具体目标类 - 原油期货
 * date: 2019/8/23 17:51 by lcz
 */
public class JConcreteSubject extends Observable {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        //设置内部标志位，注明数据发生变化
        super.setChanged();

        //通知观察者，价格发生拜年话
        super.notifyObservers(price);

        this.price = price;
    }
}
