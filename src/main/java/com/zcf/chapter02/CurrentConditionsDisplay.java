package com.zcf.chapter02;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 10:17
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
