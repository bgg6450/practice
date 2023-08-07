package com.example.practice.designpattern.decorator.condiment;

import com.example.practice.designpattern.decorator.coffee.Coffee;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Mocha extends CondimentDecorator {

    private final Coffee coffee;

    @Override
    public double cost() {
        return coffee.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", 모카";
    }

}
