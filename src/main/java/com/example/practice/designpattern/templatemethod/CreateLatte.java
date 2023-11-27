package com.example.practice.designpattern.templatemethod;

public class CreateLatte extends CreateCoffee {
    @Override
    void addMilk() {
        System.out.println("우유 추가");
    }

    // hook
    @Override
    void sizeUp(Boolean isTall) {
        if (!isTall) {
            System.out.println("사이즈 업");
        }
    }

    @Override
    void printOrder() {
        System.out.println("[라떼 제조]");
    }

}
