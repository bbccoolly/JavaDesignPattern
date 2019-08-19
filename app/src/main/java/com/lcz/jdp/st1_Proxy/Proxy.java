package com.lcz.jdp.st1_Proxy;

/**
 * desc: 代理 - 中介
 * date: 2019/8/19 16:15 by lcz
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        preRequest();
        realSubject.Request();
        postRequest();

    }

    public void preRequest() {
        System.out.println("访问真实主题前的 - 预处理");
    }

    public void postRequest() {
        System.out.println("访问真实主题后的 - 后续处理");
    }
}
