package com.lcz.jdp.designpattern;

import com.lcz.jdp.st1_Proxy.DynamicProxy;
import com.lcz.jdp.st1_Proxy.Proxy;
import com.lcz.jdp.st1_Proxy.RealSubject;
import com.lcz.jdp.st1_Proxy.Subject;

import java.lang.reflect.InvocationHandler;

/**
 * desc: 代理模式 - 访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介
 * date: 2019/8/19 15:25 by lcz
 */
public class ST1_Proxy {
    /**
     * 1. 优点：
     *  - 中介作用、保护目标对象作用
     *  - 代理对象可以扩展目标对象的功能
     *  - 低耦合，将客户端与目标对象分离
     *
     * 2. 缺点：
     *  - 新增的代理对象，造成请求处理速度变慢
     *  - 增加了系统的复杂度
     *  - 真实主题与代理主题一一对应，增加真实主题也要增加代理
     *  - 真实主题必须事先存在，不够灵活，可用动态代理模式
     *
     * */

    /**
     * 3. 结构：
     * - 抽象主题(Subject): 通过接口或抽象类声明真实主题和代理对象之间的业务方法
     * - 真实主题(Real Subject): 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
     * - 代理(Proxy): 提供了与真实主题相同的接口，内部含有对真实主题的引用，它可以访问、控制、扩展真实主题的功能
     */

    /**
     * 4. 应用场景：
     *  -1. 远程代理：隐藏目标对象存在于不同地址空间的事实，访问网盘 - 虚拟网盘  - 真实网盘
     *  -2. 虚拟代理：要创建的目标很大，用小比例的虚拟代理替换真实的对象
     *  -3. 安全代理：控制客户对真实对象的访问权限
     *  -4. 只能指引：调用目标对象时，附加额外的处理功能，比如引用次数
     *  -5. 延迟加载：提高系统性能
     *
     * */



    public static void main(String[] args) {
        //静态代理
        Proxy proxy = new Proxy();
        proxy.Request();

        //动态代理
        RealSubject subject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(subject);
        Subject o = (Subject) java.lang.reflect.Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), dynamicProxy);
        o.Request();
    }
}
