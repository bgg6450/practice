package com.example.practice.designpattern.observer;

/**
 * Subject 의 역할을 추상화하여 정의
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
