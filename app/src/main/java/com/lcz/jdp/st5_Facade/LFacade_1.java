package com.lcz.jdp.st5_Facade;

/**
 * desc: TODO
 * date: 2019/8/20 17:40 by lcz
 */
public class LFacade_1 extends LAbstractFacade{

    private SubSystem_1 subSystem_1 = new SubSystem_1();
    private SubSystem_2 subSystem_2 = new SubSystem_2();
    private SubSystem_3 subSystem_3 = new SubSystem_3();

    @Override
    public void method() {
        subSystem_1.method_1();
        subSystem_2.method_2();
        subSystem_3.method_3();
    }
}
