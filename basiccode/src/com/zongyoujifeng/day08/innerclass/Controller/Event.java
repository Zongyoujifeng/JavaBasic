package com.zongyoujifeng.day08.innerclass.Controller;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Event
 * @description 控制框架 在事件“就绪”时执行事件（基于时间触发的事件），对于要控制什么，控制框架并不包含任何具体信息，具体信息在实现算法的action()部分的时候，通过继承来实现。
 * @date 2021/2/18 21:28
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    /**
     * 何时执行action方法
     * @return 布尔值
     */
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    /**
     * 具体执行操作
     */
    public abstract void action();

}
