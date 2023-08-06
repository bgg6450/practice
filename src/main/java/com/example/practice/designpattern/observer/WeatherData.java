package com.example.practice.designpattern.observer;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Subject 를 구현. 상태값을 가지고 있다.
 */
@Getter
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temporature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update(temporature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temporature, float humidity, float pressure) {
        this.temporature = temporature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
