package com.example.practice.doit.chapter15;

public class TestThread {
    public static void main(String[] args) {
        Thread smiFileThread = new SMIFileThread();

//        Runnable myRunnuble = new MyRunnuble();
//        Thread thread = new Thread(myRunnuble);

//        Thread threadUnnamedClass = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int[] intArray = new int[]{1, 2, 3, 4, 5};
//                for (int i = 0; i < intArray.length; i++) {
//                    System.out.print("(비디오 프레임) " + intArray[i] + "-");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });

        Thread threadLambda = new Thread(() -> {
            int[] intArray = new int[]{1, 2, 3, 4, 5};
            for (int j : intArray) {
                System.out.print("(비디오 프레임) " + j + "-");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        smiFileThread.start();
//        thread.start();
//        threadUnnamedClass.start();
        threadLambda.start();
    }
}
