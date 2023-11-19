package com.example.practice.designpattern.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingTemplateImpl2 extends LoggingTemplate {

    @Override
    void main() {
        log.info("2번 패턴");
    }

}
