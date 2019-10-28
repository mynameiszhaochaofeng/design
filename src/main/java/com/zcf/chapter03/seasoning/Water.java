package com.zcf.chapter03.seasoning;

import com.zcf.chapter03.Caffe;
import com.zcf.chapter03.CaffeSize;

/**
 * 水（必须品）
 * @author zhaochaofeng
 * @date 2019/10/28 16:59
 */
public class Water extends CaffeSeasoning {
    Caffe caffe;

    /**
     * 默认是中等
     * @param caffe
     */
    public Water(Caffe caffe) {
        this.caffe = caffe;
        caffe.setSize(CaffeSize.Grande.getType());
    }

    public Water(Caffe caffe, String size) {
        this.caffe = caffe;
        caffe.setSize(size);
    }

    @Override
    public String getSize() {
        return caffe.getSize();
    }

    @Override
    public String getDescription() {
        return caffe.getSize()+" "+caffe.getDescription()+",Water";
    }

    @Override
    public double cost() {
        double cost = caffe.cost();
        return cost + CaffeSize.getCostByType(caffe.getSize());
    }
}
