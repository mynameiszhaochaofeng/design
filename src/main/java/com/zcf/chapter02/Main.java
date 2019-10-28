package com.zcf.chapter02;

import java.util.Observable;

/**
 * 观察者模式（使用java内置的观察者模式）
 * @author zhaochaofeng
 * @date 2019/10/28 9:50
 */
public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        data.setMeasurements(10.0f,11.1f,18.1f);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(new Observable());
        currentConditionsDisplay.update(data,null);
        ForecastDisplay forecastDisplay = new ForecastDisplay(new Observable());
        forecastDisplay.update(data, null);
    }
}
