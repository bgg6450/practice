package com.example.practice.designpattern.observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void display() {
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
}
