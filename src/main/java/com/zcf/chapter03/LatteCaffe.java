package com.zcf.chapter03;

/**
 * 拿铁
 * @author zhaochaofeng
 * @date 2019/10/28 15:59
 */
public class LatteCaffe extends Caffe {
    public LatteCaffe() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 32;
    }
}
