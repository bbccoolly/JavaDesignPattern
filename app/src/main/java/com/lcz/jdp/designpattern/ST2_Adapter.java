package com.lcz.jdp.designpattern;

import com.lcz.jdp.st2_Adapter.LAdaptee;
import com.lcz.jdp.st2_Adapter.LAdapter;
import com.lcz.jdp.st2_Adapter.LTarget;
import com.lcz.jdp.st2_Adapter.ObjectAdapter;

/**
 * desc: 适配器模式 - 将一个类的接口转成客户希望的另外一个接口，中英文之间的翻译、SD卡读卡器
 * date: 2019/8/19 15:25 by lcz
 */
public class ST2_Adapter {
    /**
     * 1. 定义：
     *  - 适配器模式分为 类结构型模式 和 对象结构型模式
     *  - 类结构模式中，类之间的耦合度相对较高，且需了解相关组件的内部结构
     *
     * 2. 优点：
     *  - 1. 通过适配器模式可以透明的调用目标接口
     *  - 2. 复用了现存的类，不需要修改原有代码而重用现有的适配者类
     *  - 3. 将目标类和适配者类解耦，解决接口不一致问题
     * */

    /**
     * 3. 模式的结构：
     * - 目标(LTarget)接口：当前系统业务所期待的接口，可以是抽象类或接口
     * - 适配者(Adapter)类：是被访问和适配的现存组件库中的组件接口
     * - 适配器(Adapter)类：转换器，通过继承和引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者
     */

    /**
     * 4. 引用场景
     *  - 以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致
     *  - 使用第三方提供的组件，胆是组件接口定义和自己要求的接口定义不同
     *
     * */


    /**
     * 5. 适配器模式可以扩展为，双向适配器模式
     *  - 双向适配器模式，既可以吧适配者接口转换成目标接口，页可以把目标接口转换成适配者接口
     *  - 待续...
     *
     * */

    public static void main(String[] args) {
        //类适配器
        LTarget target = new LAdapter();
        target.Request();

        //对象适配器
        LAdaptee adaptee = new LAdaptee();
        LTarget target1 = new ObjectAdapter(adaptee);
        target1.Request();
    }
}
