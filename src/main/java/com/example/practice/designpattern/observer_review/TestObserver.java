package com.example.practice.designpattern.observer_review;

public class TestObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ConcreteObserver concreteObserver = new ConcreteObserver(weatherData);
        weatherData.setMeasurement(36, 80, 1000);
        System.out.println(concreteObserver.getTemperature());
        System.out.println(concreteObserver.getHumidity());
        System.out.println(concreteObserver.getPressure());
    }
}
