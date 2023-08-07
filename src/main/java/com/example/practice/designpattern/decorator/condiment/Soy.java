package com.example.practice.designpattern.decorator.condiment;

import com.example.practice.designpattern.decorator.coffee.Coffee;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Soy extends CondimentDecorator {

    private final Coffee coffee;

    @Override
    public double cost() {
        return coffee.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", 두유";
    }
}
