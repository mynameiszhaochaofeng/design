package com.zcf.chapter02;

import java.util.Observable;

/**
 * 天气主题，继承java自带的Observable
 * @author zhaochaofeng
 * @date 2019/10/28 10:03
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * description:天气信息发生变化
     *
     * @param
     * @return void
     */
    private void measurementChanged() {
        //调用Obserable的setChange，标记状态已经改变的事实
        setChanged();
        //然后开始通知，此处还可以使用notifyObservers(Object arg)通知时带数据对象过去
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
