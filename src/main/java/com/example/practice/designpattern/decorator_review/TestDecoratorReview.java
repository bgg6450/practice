package com.example.practice.designpattern.decorator_review;

public class TestDecoratorReview {
    public static void main(String[] args) {
        Beverage beverage = new Mocha();
        Beverage beverage2 = new Decaffein(beverage);
        Beverage beverage3 = new Whiping(beverage2);
        System.out.println(beverage3.cost());
    }
}
