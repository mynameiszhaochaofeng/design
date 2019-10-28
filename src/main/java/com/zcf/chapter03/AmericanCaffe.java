package com.zcf.chapter03;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 16:00
 */
public class AmericanCaffe extends Caffe{
    public AmericanCaffe() {
        description = "American";
    }

    @Override
    public double cost() {
        return 28;
    }
}
