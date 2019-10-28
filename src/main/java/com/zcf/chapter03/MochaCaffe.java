package com.zcf.chapter03;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 16:00
 */
public class MochaCaffe extends Caffe {
    public MochaCaffe() {
        description = "Mocha";
    }

    @Override
    public double cost() {
        return 35;
    }
}
