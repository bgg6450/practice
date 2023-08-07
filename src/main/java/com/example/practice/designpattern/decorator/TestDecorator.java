package com.example.practice.designpattern.decorator;

import com.example.practice.designpattern.decorator.coffee.Coffee;
import com.example.practice.designpattern.decorator.coffee.DarkRoast;
import com.example.practice.designpattern.decorator.condiment.Mocha;
import com.example.practice.designpattern.decorator.condiment.Soy;
import com.example.practice.designpattern.decorator.condiment.SteamMilk;

public class TestDecorator {
    public static void main(String[] args) {
        Coffee coffee1 = new DarkRoast();
        Coffee coffee2 = new SteamMilk(coffee1);
        Coffee coffee3 = new Mocha(coffee2);
        Coffee coffee4 = new Soy(coffee3);
        System.out.println(coffee4.getDescription());
        System.out.println(coffee4.cost());
    }
}
