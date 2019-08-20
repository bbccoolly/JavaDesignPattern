package com.lcz.jdp.st2_Adapter;

/**
 * desc: 类适配器
 * date: 2019/8/20 12:09 by lcz
 */
public class LAdapter extends LAdaptee implements LTarget {
    @Override
    public void Request() {
        specificRequest();
    }
}
