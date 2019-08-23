package com.lcz.jdp.designpattern;

import com.lcz.jdp.bt2_Strategy.LAbstractStrategy;
import com.lcz.jdp.bt2_Strategy.LConcreteStrategy_1;
import com.lcz.jdp.bt2_Strategy.LConcreteStrategy_2;
import com.lcz.jdp.bt2_Strategy.LContext;

/**
 * desc: 策略模式 - 定义封装一系列算法，算法的变化不会影响使用算法的客户
 * date: 2019/8/21 11:12 by lcz
 */
public class BT2_Strategy {
    /**
     * 1.优点：
     *  -1. 策略模式，可以比避免使用多重条件语句
     *  -2. 策略模式，提供了一系列可供重用的算法族，继承可以使算法族的公共代码转移到父类，避免重复代码
     *  -3. 提供相同行为的不同实现，
     *  -4. 完美支持 OCP
     *  -5. 把算法的使用放到环境类中，算法的实现移到具体策略类，实现了二者的分离
     *
     * 2.缺点：
     *  -1. 会造成很多策略类
     *
     * */


    /**
     * 3. 结构：
     * -1. 抽象策略(Abstract Strategy)类：定义一个公共接口，环境角色使用该接口调用不同的算法。(通过接口或抽象类实现)
     * -2. 具体策略(Concrete Strategy)类：实现抽象策略定义的接口，提供具体的算法实现
     * -3. 环境(Context)类：持有一个策略类的引用，最终给客户端调用
     */

    public static void main(String[] args) {
        LContext context = new LContext();
        LAbstractStrategy strategy = new LConcreteStrategy_1();
        context.setStrategy(strategy);
        context.strategyMethod();

        strategy = new LConcreteStrategy_2();
        context.setStrategy(strategy);
        context.strategyMethod();



    }
}
