package com.zcf.chapter03.seasoning;

import com.zcf.chapter03.Caffe;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 16:20
 */
public class Caramel extends CaffeSeasoning {
    Caffe caffe;

    public Caramel(Caffe caffe) {
        this.caffe = caffe;
    }

    @Override
    public String getDescription() {
        return caffe.getDescription()+",Caramel";
    }

    @Override
    public double cost() {
        return 1.00+caffe.cost();
    }
}
