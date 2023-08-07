package com.example.practice.designpattern.decorator.coffee;

public class Espresso extends Coffee {

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "에스프레소 커피";
    }

}
