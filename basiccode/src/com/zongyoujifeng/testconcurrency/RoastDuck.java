package com.zongyoujifeng.testconcurrency;

public class RoastDuck {
    private String name;
    private int count = 1;//烤鸭初始数量
    private boolean flag = false;//判断是否需要线程等待的标志

    /**
     * 生产烤鸭
     * @param name 名称
     */
    public synchronized void product(String name){
        // if (flag) {
        //     // 此时有烤鸭
        //     try {
        //         this.wait();
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
        while (flag) {
            // 此时有烤鸭
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name + count;//烤鸭名称
        count++;
        System.out.println(Thread.currentThread().getName()+"...生产者..." + this.name);
        flag = true;//有烤鸭后改变标志
        notifyAll();
    }

    /**
     * 消费烤鸭
     */
    public synchronized void consume() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // if (!flag) {
        //     try {
        //         this.wait();
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }


        System.out.println(Thread.currentThread().getName()+"...消费者......" + this.name);
        flag = false;
        notifyAll();
    }
}
