package com.zongyoujifeng.day17.concurrency;

public class LiftOff implements Runnable {//实现Runnable接口 重写run()方法
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;//标识符id用来区分任务的多个实例

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    private String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "). ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
