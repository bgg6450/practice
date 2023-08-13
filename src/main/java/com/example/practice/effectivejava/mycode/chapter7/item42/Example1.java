package com.example.practice.effectivejava.mycode.chapter7.item42;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {

        List<String> comany = new ArrayList<>();
        comany.add("nvidia");
        comany.add("moderna");
        comany.add("dell");
        comany.add("apple");

        Collections.sort(comany, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        Collections.sort(comany, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        Collections.sort(comany, Comparator.comparingInt(String::length));

        comany.forEach(System.out::println);
    }
}
