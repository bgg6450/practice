package com.example.practice.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyMain {

    public static void test1() {
        LoggingStrategy loggingStrategy1 = new LoggingStrategyImpl1();
        long start = System.currentTimeMillis();
        loggingStrategy1.execute();
        long end = System.currentTimeMillis();
        log.info("실행 시간 = {}", end - start);
    }

    public static void test2() {
        LoggingStrategy loggingStrategy2 = new LoggingStrategyImpl2();
        long start = System.currentTimeMillis();
        loggingStrategy2.execute();
        long end = System.currentTimeMillis();
        log.info("실행 시간 = {}", end - start);
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
