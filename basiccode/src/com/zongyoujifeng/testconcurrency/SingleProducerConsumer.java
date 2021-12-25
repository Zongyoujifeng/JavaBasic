package com.zongyoujifeng.testconcurrency;

public class SingleProducerConsumer {
    public static void main(String[] args) {
        RoastDuck r = new RoastDuck();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {
    private RoastDuck r;

    public Producer(RoastDuck r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.product("烤鸭");
        }
    }
}

class Consumer implements Runnable {
    private RoastDuck r;

    public Consumer(RoastDuck r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.consume();
        }
    }
}