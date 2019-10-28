package com.zcf.chapter02;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 10:40
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable o) {
        o.addObserver(this);
    }

    public void display() {
        System.out.println("Current Pressure "+currentPressure+"Pa,Last Pressure "+lastPressure+"Pa");
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
