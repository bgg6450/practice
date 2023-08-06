package com.example.practice.designpattern.observer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConcreteObserver implements Observer {

    private final ConcreteObserver concreteObserver;

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("temp = " + temp);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);
    }
}
