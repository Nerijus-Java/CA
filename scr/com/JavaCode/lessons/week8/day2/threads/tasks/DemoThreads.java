package com.JavaCode.lessons.week8.day2.threads.tasks;

public class DemoThreads {

    public static final int HOW_MANY = 10;

    public static void main(String[] args) {

        System.out.println("total :" + Thread.activeCount());
        System.out.println("Main :" + Thread.currentThread().getName());

        new Thread(() -> doSome(1)).start();

        new Thread(() -> doSome(2)).start();


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                doSome(2);
//            }
//        }).start();
    }

    private static void doSome(int i) {
        for (int j = 0; j < HOW_MANY; j++) {
            System.out.println("thread :" + i + "  Doing something" + "  -" + Thread.currentThread().getName());
            currentThreadSleep();
        }
    }

    public static void currentThreadSleep() {
        try {
            Thread.sleep(250L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
