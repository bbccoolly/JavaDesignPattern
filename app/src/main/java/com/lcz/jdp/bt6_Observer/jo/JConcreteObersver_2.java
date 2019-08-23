package com.lcz.jdp.bt6_Observer.jo;

import java.util.Observable;
import java.util.Observer;

/**
 * desc: 具体观察者 2 - 空方
 * date: 2019/8/23 17:55 by lcz
 */
public class JConcreteObersver_2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
