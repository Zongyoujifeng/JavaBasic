package com.zongyoujifeng.testconcurrency;

public class MultiProducerConsumer {
    public static void main(String[] args) {
        RoastDuck r = new RoastDuck();
        MultiProducer pro = new MultiProducer(r);
        MultiConsumer con = new MultiConsumer(r);
        // 生产者线程
        Thread t0 = new Thread(pro);
        Thread t1 = new Thread(con);

        Thread t2 = new Thread(pro);
        Thread t3 = new Thread(con);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

class MultiProducer implements Runnable {
    private RoastDuck r;

    public MultiProducer(RoastDuck r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.product("烤鸭");
        }
    }
}

class MultiConsumer implements Runnable {
    private RoastDuck r;

    public MultiConsumer(RoastDuck r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.consume();
        }
    }
}
