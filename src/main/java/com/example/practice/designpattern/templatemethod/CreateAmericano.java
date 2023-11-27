package com.example.practice.designpattern.templatemethod;

public class CreateAmericano extends CreateCoffee {
    @Override
    void addMilk() {
        System.out.println("우유 추가 안함");
    }

    @Override
    void sizeUp(Boolean isTall) {
        if (!isTall) {
            System.out.println("사이즈 업");
        }
    }

    @Override
    void printOrder() {
        System.out.println("[아메리카노 제조]");
    }
}
