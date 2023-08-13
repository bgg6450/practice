package com.example.practice.doit.chapter15;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("스레드실행: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new MyThread();   // 다형성에 의해 Thread 로 받을 수도 있다. 의미는 똑같음
        thread1.start();
        thread2.start();
    }
}
