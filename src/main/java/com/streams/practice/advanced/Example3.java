package com.streams.practice.advanced;


public class Example3 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
//      mt.start();

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("main thread: m" + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread: t" + i);
        }
    }
}

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread: t" + i);
        }
    }
}

// new() or born --> run or runnable --> running state --> dead
// MyThread mt = new MyThread() --> mt.start()  --> if thread scheduler allocates processor --> running state --> if run() method completes --> dead
