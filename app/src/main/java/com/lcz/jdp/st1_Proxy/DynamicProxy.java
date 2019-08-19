package com.lcz.jdp.st1_Proxy;

/**
 * desc: 动态代理
 * date: 2019/8/19 17:11 by lcz
 */
public class DynamicProxy implements Subject {

    public void Request() {

    }


    public void preRequest() {
        System.out.println("访问真实主题前的 - 预处理");
    }

    public void postRequest() {
        System.out.println("访问真实主题后的 - 后续处理");
    }
}
