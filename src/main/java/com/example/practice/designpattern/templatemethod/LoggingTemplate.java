package com.example.practice.designpattern.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class LoggingTemplate {

    public void executeTime() {
        long start = System.currentTimeMillis();
        main();
        long end = System.currentTimeMillis();
        log.info("실행 시간 = {}", end - start);
    }

    abstract void main();
    
}
