package com.zcf.chapter03.seasoning;

import com.zcf.chapter03.Caffe;

/**
 * 牛奶
 * @author zhaochaofeng
 * @date 2019/10/28 16:13
 */
public class Milk extends CaffeSeasoning {
    Caffe caffe;

    public Milk(Caffe caffe) {
        this.caffe = caffe;
    }

    @Override
    public String getDescription() {
        return caffe.getDescription()+",Milk";
    }

    @Override
    public double cost() {
        return 3.00+caffe.cost();
    }
}
