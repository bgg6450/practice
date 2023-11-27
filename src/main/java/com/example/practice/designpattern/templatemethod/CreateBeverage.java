package com.example.practice.designpattern.templatemethod;

public class CreateBeverage {

    public static void main(String[] args) {
        create(false);
        create(true);
    }

    public static void create(Boolean isTall) {
        CreateCoffee createAmericano = new CreateAmericano();
        createAmericano.create(isTall);
        System.out.println("----------------");
        CreateCoffee createCoffee = new CreateLatte();
        createCoffee.create(isTall);
        System.out.println("----------------");
    }

}
