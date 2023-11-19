package com.example.practice.designpattern.templatemethod;

public class TemplateMain {

    public static void main(String[] args) {
        execute1();
        execute2();
    }

    public static void execute1() {
        LoggingTemplate loggingTemplate = new LoggingTemplateImpl1();
        loggingTemplate.executeTime();
    }

    public static void execute2() {
        LoggingTemplate loggingTemplate = new LoggingTemplateImpl2();
        loggingTemplate.executeTime();
    }
}
