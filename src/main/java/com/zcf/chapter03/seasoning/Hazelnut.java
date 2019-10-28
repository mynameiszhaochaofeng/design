package com.zcf.chapter03.seasoning;

import com.zcf.chapter03.Caffe;

/**
 * 榛果
 * @author zhaochaofeng
 * @date 2019/10/28 16:13
 */
public class Hazelnut extends CaffeSeasoning {
    Caffe caffe;

    public Hazelnut(Caffe caffe) {
        this.caffe = caffe;
    }

    @Override
    public String getDescription() {
        return caffe.getDescription()+",Hazelnut";
    }

    @Override
    public double cost() {
        return 2.00+caffe.cost();
    }
}
