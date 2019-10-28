package com.zcf.chapter03;

import com.zcf.chapter03.seasoning.Caramel;
import com.zcf.chapter03.seasoning.Hazelnut;
import com.zcf.chapter03.seasoning.Milk;
import com.zcf.chapter03.seasoning.Water;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 16:52
 */
public class Main {

    public static void main(String[] args) {
        Caffe caffe = new AmericanCaffe();
        caffe = new Water(caffe);
        System.out.println(caffe.getDescription()+",价格："+caffe.cost());

        Caffe caffe1 = new LatteCaffe();
        caffe1 = new Water(caffe1,CaffeSize.Venti.getType());
        caffe1 = new Milk(caffe1);
        caffe1 = new Caramel(caffe1);
        System.out.println(caffe1.getDescription()+",价格："+caffe1.cost());

        Caffe caffe2 = new MochaCaffe();
        caffe2 = new Water(caffe2,CaffeSize.Super.getType());
        caffe2 = new Hazelnut(caffe2);
        System.out.println(caffe2.getDescription()+",价格："+caffe2.cost());
    }

}
