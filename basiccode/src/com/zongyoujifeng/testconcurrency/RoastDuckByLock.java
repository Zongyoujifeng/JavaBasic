package com.zongyoujifeng.testconcurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RoastDuckByLock {
    private String name;
    private int count = 1;
    private boolean flag = false;

    // 创建锁对象
    private Lock resourceLock = new ReentrantLock();

    // 创建条件对象
    private Condition condition = resourceLock.newCondition();

    public void product(String name) {
        resourceLock.lock();
        try {
            if (flag) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name + count;//烤鸭名称
            count++;
            System.out.println(Thread.currentThread().getName()+"...生产者..." + this.name);
            flag = true;
            condition.signalAll();
        } finally {
            resourceLock.unlock();
        }
    }

    public void consume() {
        resourceLock.lock();
        try {
            if (!flag) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"...消费者..." + this.name);
            flag = false;
            condition.signalAll();
        } finally {
            resourceLock.unlock();
        }
    }
}
