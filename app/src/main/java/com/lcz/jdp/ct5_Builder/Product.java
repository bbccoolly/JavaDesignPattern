package com.lcz.jdp.ct5_Builder;

/**
 * desc: 产品角色 - 包含多个组成部件的复杂对象
 * date: 2019/8/19 14:33 by lcz
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("实现产品特性");
    }
}
