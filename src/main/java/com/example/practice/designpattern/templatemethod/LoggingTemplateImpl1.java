package com.example.practice.designpattern.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingTemplateImpl1 extends LoggingTemplate {

    @Override
    void main() {
        log.info("1번 패턴");
    }

}
