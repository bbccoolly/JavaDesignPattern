package com.lcz.jdp.designpattern;

import com.lcz.jdp.st5_Facade.LFacade;
import com.lcz.jdp.st5_Facade.LFacade_1;

/**
 * desc: 外观模式 - 为多个复杂的子系统提供一个一致的接口，使子系统更加容易被访问的模式
 * date: 2019/8/19 15:25 by lcz
 */
public class ST5_Facade {
    /**
     * 1. 优点：是迪米特法则的典型应用
     *  -1. 降低耦合度，子系统的变化不会影响调用它的客户类
     *  -2. 对客户屏蔽了子系统组件，减少了客户处理的对象数目
     *  -3. 降低系统编译依赖性，简化跨平台之间的移植过程
     * 2. 缺点：
     *  -1. 不能很好的限制客户使用子系统
     *  -2. 增加新的子系统需要修改外观类或客户端的源代码，违背了 OCP
     * */

    /**
     * 3. 结构：
     * -1. 外观(Facade) 角色：为多个子系统对外提供一个共同的接口
     * -2. 子系统(Sub System)角色：实现系统部分功能，客户可以通过外观角色访问它
     * -3. 客户(Client)角色：通过一个外观角色访问各个子系统的功能
     */

    /**
     * 4. 应用场景：
     *  -1. 客户端与多个子系统之间存在很大得联系时，外观模式可以将它们分离
     *  -2.复杂的系统有很多子系统时...
     *
     * */

    /**
     * 5. 扩展：
     *  -1. 抽象外观类的出现，解决违背 OCP 的问题
     *
     *
     *
     * */

    public static void main(String[] args) {
        LFacade facade = new LFacade();
        facade.method();

        LFacade_1 facade1 = new LFacade_1();
        facade1.method();
    }
}
