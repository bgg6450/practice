package com.example.practice.designpattern.templatemethod;

public abstract class CreateCoffee {

    // 핵심 로직 실행
    void create(Boolean isTall) {
        printOrder();
        receiveOrder();
        sizeUp(isTall);
        addShot();
        pourWater();
        addMilk();
        terminateOrder();
    }

    // 자식 클래스에서 구현 시 가변 부분은 추상 메서드로 선언하여 자식 클래스에서 구현하도록 한다.
    abstract void addMilk();

    // hook. 자식 클래스에서 선택적으로 구현할 수 있다.
    void sizeUp(Boolean isTall) {}
    void printOrder() {}

    // 공통적인 핵심 로직들을 부모인 추상 클래스에 숨긴다 => 코드가 매우 간결해짐. 단일 책임 원칙(SRP)
    private void pourWater() {
        System.out.println("물을 붓는다");
    }

    private void addShot() {
        System.out.println("샷 추가");
    }

    private void receiveOrder() {
        System.out.println("주문 받음");
    }

    private void terminateOrder() {
        System.out.println("주문 종료");
    }

}
