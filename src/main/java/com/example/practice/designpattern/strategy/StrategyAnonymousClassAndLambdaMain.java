package com.example.practice.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyAnonymousClassAndLambdaMain {

    public static void test1() {
        long start = System.currentTimeMillis();
        LoggingStrategy loggingStrategy = () -> log.info("익명 클래스로 커스텀 로직 실행");
        loggingStrategy.execute();
        long end = System.currentTimeMillis();
        log.info("실행 시간 = {}", end - start);
    }

    public static void test2() {
        long start = System.currentTimeMillis();
        LoggingStrategy loggingStrategy = () -> log.info("람다로 커스텀 로직 실행");
        loggingStrategy.execute();
        long end = System.currentTimeMillis();
        log.info("실행 시간 = {}", end - start);
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
