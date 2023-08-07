package com.example.practice.designpattern.decorator.condiment;

import com.example.practice.designpattern.decorator.coffee.Coffee;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class CondimentDecorator extends Coffee {
    public abstract String getDescription();
}
