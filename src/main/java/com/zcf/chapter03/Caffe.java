package com.zcf.chapter03;

/**
 * 咖啡
 * @author zhaochaofeng
 * @date 2019/10/28 15:55
 */
public abstract class Caffe {
    String description= "Unknown Caffe";
    private String size;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
