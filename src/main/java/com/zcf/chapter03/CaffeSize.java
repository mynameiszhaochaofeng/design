package com.zcf.chapter03;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 17:04
 */
public enum CaffeSize {
    Grande("中杯",1.00d),Venti("大杯",3.00d),Super("超大杯",5.00);
    private String type;
    private double cost;

    CaffeSize(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public static double getCostByType(String type){
        CaffeSize[] caffeSizes = CaffeSize.values();
        for(CaffeSize caffeSize : caffeSizes){
            if(type.equals(caffeSize.getType())){
                return caffeSize.getCost();
            }
        }
        return 0.00d;
    }
}
