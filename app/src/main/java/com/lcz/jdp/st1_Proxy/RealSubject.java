package com.lcz.jdp.st1_Proxy;

/**
 * desc: 真实主题
 * date: 2019/8/19 16:12 by lcz
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法 - ");
    }
}
