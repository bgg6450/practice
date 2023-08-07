package com.example.practice.designpattern.observer_review;

import lombok.Getter;

@Getter
public class ConcreteObserver implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public ConcreteObserver(Subject weatherData) {
        weatherData.addObserver(this);
    }
}