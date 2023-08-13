package com.example.practice.effectivejava.mycode.chapter7.item44;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example1 extends LinkedHashMap {

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > 100;
    }

}
