package com.lcz.jdp.designpattern;

import com.lcz.jdp.bt6_Observer.LAbstractObserver;
import com.lcz.jdp.bt6_Observer.LAbstractSubject;
import com.lcz.jdp.bt6_Observer.LConcreteObserver_1;
import com.lcz.jdp.bt6_Observer.LConcreteObserver_2;
import com.lcz.jdp.bt6_Observer.LConcreteSubject;
import com.lcz.jdp.bt6_Observer.jo.JConcreteObersver_2;
import com.lcz.jdp.bt6_Observer.jo.JConcreteObserver_1;
import com.lcz.jdp.bt6_Observer.jo.JConcreteSubject;

/**
 *
 * desc: 观察者模式 - 多个对象之间存在一对多的依赖关系，一个对象发生变化时，所有依赖他的对象都得到通知并自动过呢更新
 * date: 2019/8/21 11:12 by lcz
 */
public class BT6_Observer {

    /**
     * 1. 优点：
     *  -1. 降低了目标与观察者之间的耦合关系
     *  -2. 目标月观察者之间建立了一套出发机制
     *
     * 2. 缺点：
     *  -1. 目标与观察者之间的依赖关系
     *  -2. 当观察者目标很多时，通知的发布会花费很多时间
     *
     * */


    /**
     * 3. 结构：
     * -1. 抽象主题(Abstract Subject)角色：提供一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法
     * -2. 具体主题(Concrete Subject)角色：实现抽象主题中的通知方法，
     * -3. 抽象观察者(Abstract Observer)角色：是一个抽象类或接口，包含一个更新自己的抽象方法，当接到具体主题的更改通知时被调用
     * -4. 具体观察者(Concrete Observer)角色：实现抽象观察者中的抽象方法，以便在得到目标的更改通知时更新自身状态
     */

    /**
     * 4. 应用场景：
     *  -1. 对象间存在一对多的关系，一个对象的变化会影响其它对象
     *  -2. 要给抽象模型有两个方面，其中一个方面依赖与另一个方面，可将这二者封装在独立的对象中，使他们可以各自独立地改变和使用
     *
     * */

    public static void main(String[] args) {
        LAbstractSubject subject = new LConcreteSubject();
        LAbstractObserver observer1 = new LConcreteObserver_1();
        LAbstractObserver observer2 = new LConcreteObserver_2();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObserver();

        System.out.println("----------------------");

        JConcreteSubject js = new JConcreteSubject();
        JConcreteObserver_1 jo1 = new JConcreteObserver_1();
        JConcreteObersver_2 jo2 = new JConcreteObersver_2();

        js.addObserver(jo1);
        js.addObserver(jo2);
        js.setPrice(10);
        js.setPrice(-9);

    }
}

