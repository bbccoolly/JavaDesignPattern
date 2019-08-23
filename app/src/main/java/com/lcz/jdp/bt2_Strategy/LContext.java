package com.lcz.jdp.bt2_Strategy;

/**
 * desc: 环境类
 * date: 2019/8/23 10:19 by lcz
 */
public class LContext {
    private LAbstractStrategy strategy;

    public LAbstractStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(LAbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }


}

