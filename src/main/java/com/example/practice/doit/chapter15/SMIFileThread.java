package com.example.practice.doit.chapter15;

public class SMIFileThread extends Thread {
    @Override
    public void run() {
        String[] strArray = new String[]{"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막) " + strArray[i]);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
