package com.example.practice.designpattern.decorator.coffee;

public class Decaffein extends Coffee {

    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return "디카페인 커피";
    }

}
