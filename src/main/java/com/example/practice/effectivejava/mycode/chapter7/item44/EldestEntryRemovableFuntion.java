package com.example.practice.effectivejava.mycode.chapter7.item44;

import java.util.Map;

@FunctionalInterface
public interface EldestEntryRemovableFuntion<K, V> {
    boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
}
