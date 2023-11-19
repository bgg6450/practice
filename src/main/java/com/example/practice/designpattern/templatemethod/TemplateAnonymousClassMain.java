package com.example.practice.designpattern.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplateAnonymousClassMain {

    /**
     * 본문 코드는 좀 지저분 해지지만 클래스를 생성하지 않기 때문에, 클래스가 범용성 있는게 아니라면 이렇게 쓰는 것도 괜찮
     */
    public static void main(String[] args) {
        LoggingTemplate loggingTemplate = new LoggingTemplate() {
            @Override
            void main() {
                log.info("익명 클래스 구현");
            }
        };
        loggingTemplate.executeTime();
    }
}
