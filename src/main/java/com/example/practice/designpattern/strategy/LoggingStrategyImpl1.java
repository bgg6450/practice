package com.example.practice.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingStrategyImpl1 implements LoggingStrategy {
    @Override
    public void execute() {
        log.info("패턴 1번");
    }
}
