package com.example.practice.designpattern.observer_review;

public interface Subject {

    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void nofifyObjserver();
}
