package com.example.practice.effectivejava.mycode.chapter7.item44;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestEldestEntryRemovableFuntion {
    public static void main(String[] args) {

        Map<String, String> myMap = new LinkedHashMap<>();
        myMap.put("A", "apple");
        myMap.put("B", "banana");
        myMap.put("C", "Cat");

    }
}
