package com.zongyoujifeng.concurrency;

public class Shop {
    private int bread = 0;

    /**
     * 生产面包
     */
    public synchronized void produceBread() {
        if (bread < 10) {
            bread++;
            System.out.println(Thread.currentThread().getName() + ": 开始生产第" + bread + "个面包");
            notify();//唤醒消费者线程
        } else {
            try {
                wait();//告诉生产者等一下
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeBread() {
        if (bread > 0) {
            bread--;
            System.out.println(Thread.currentThread().getName() + ": 开始消费第" + bread + "个面包");
            notify();//唤醒生产者线程
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
