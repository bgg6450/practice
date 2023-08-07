package com.example.practice.designpattern.decorator_review;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Whiping extends Condiment {

    private final Beverage beverage;

    @Override
    public int cost() {
        return 500 + beverage.cost();
    }
}
