package com.example.practice.doit.chapter15;

public class MyRunnuble implements Runnable {
    @Override
    public void run() {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("(비디오 프레임) " + intArray[i] + "-");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
