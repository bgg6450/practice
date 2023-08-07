package com.example.practice.designpattern.decorator.coffee;

public class HouseBlend extends Coffee {

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return "하우스블렌드 커피";
    }
}
