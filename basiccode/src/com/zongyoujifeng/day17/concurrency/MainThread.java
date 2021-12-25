package com.zongyoujifeng.day17.concurrency;

public class MainThread {//要实现线程行为，必须将一个任务附着在线程上
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
