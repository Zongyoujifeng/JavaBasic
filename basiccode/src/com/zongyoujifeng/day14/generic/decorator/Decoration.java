package com.zongyoujifeng.day14.generic.decorator;

import java.util.Date;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Decoration
 * @description 使用装饰器
 * @date 2021/4/16 9:15
 */
public class Decoration {
    public static void main(String[] args) {
        TimeStamped t = new TimeStamped(new Basic());
        long timestamp = t.getTimestamp();
        System.out.println("timestamp: " + timestamp);
        TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
        SerialNumbered num1 = new SerialNumbered(new Basic());
        SerialNumbered num2 = new SerialNumbered(new TimeStamped(new Basic()));
        long serialNumber = num1.getSerialNumber();
        System.out.println("serialNumber: " + serialNumber);
    }
}

class Basic {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Decorator extends Basic {
    protected Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    @Override
    public String getValue() {
        return basic.getValue();
    }

    @Override
    public void setValue(String value) {
        basic.setValue(value);
    }
}

class TimeStamped extends Decorator {
    private final long timestamp;

    public TimeStamped(Basic basic) {
        super(basic);
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return timestamp;
    }

}

class SerialNumbered extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumbered(Basic basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}
