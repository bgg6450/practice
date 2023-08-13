package com.example.practice.designpattern.decorator_review;

// 원본 인터페이스의 구현 클래스들
public class Latte implements Beverage {
    @Override
    public int cost() {
        return 4500;
    }
}
