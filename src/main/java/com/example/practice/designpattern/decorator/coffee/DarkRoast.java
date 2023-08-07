package com.example.practice.designpattern.decorator.coffee;

public class DarkRoast extends Coffee {

    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return "다크 로스트 커피";
    }

}
