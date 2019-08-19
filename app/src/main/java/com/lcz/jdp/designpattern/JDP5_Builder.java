package com.lcz.jdp.designpattern;

import com.lcz.jdp.dp5_Builder.Builder;
import com.lcz.jdp.dp5_Builder.ConcreteBuilder;
import com.lcz.jdp.dp5_Builder.Director;
import com.lcz.jdp.dp5_Builder.Product;

/**
 * desc: 建造者模式 - 复杂对象的构造与表示分离，同样的构造过程可以创建不同的表示
 * date: 2019/8/19 14:22 by lcz
 */
public class JDP5_Builder {
    /**
     * 1. 优点：
     *  - 各个具体的建造者相互独立，利于系统扩展
     *  - 客户端不必知道内部组成的具体细节，便于控制细节风险
     * 2. 缺点：
     *  - 产品组成部分必须相同，限制了其使用范围
     *  - 如果产品内部过于复杂，会增加很多的建造者类
     */

    /**
     * 3. 结构：
     * - 产品角色(Product): 包含多个组成部件的复杂对象，由具体建造者来创建其各个部件
     * - 抽象建造者(Builder): 包含创建产品各个子部件的抽象方法的接口，以及一个返回复杂产品的方法 getResult()
     * - 具体建造者(Concrete Builder): 实现 Builder 接口，完成产品部件的具体建造
     * - 指挥者(Director): 调用建造者对象中的部件构造与装配方法完成复杂对象的船舰，不涉及具体产品信息
     */

    /**
     * 4. 应用场景：
     *  - 1. 创建的对象复杂，由多个部件组成，各个部件面临着复杂的变化，但是，构件间的建造顺序是稳定的
     *  - 2. 产品的创建过程和最终表示是独立的，
     * */

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product construct = director.construct();
        construct.show();
    }
}
