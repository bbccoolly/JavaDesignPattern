package com.lcz.jdp.st1_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * desc: 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
 * 该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类
 * date: 2019/8/19 17:11 by lcz
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        method.invoke(target, args);
        postRequest();
        return null;
    }

    public void preRequest() {
        System.out.println("访问真实主题前的 - 预处理");
    }

    public void postRequest() {
        System.out.println("访问真实主题后的 - 后续处理");
    }
}
