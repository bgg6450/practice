package com.example.practice.designpattern.decorator.coffee;

public abstract class Coffee {

    String description = "제목 없음";

    public abstract String getDescription();
    public abstract double cost();
}
