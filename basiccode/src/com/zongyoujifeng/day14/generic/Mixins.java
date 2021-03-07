package com.zongyoujifeng.day14.generic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Mixins
 * @description 使用接口产生混型效果
 * @date 2021/4/16 8:37
 */
public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }
}

interface Timestamped {
    String getStamp();
}

class TimeStampedImp implements Timestamped {
    private final String timeStamp;

    public TimeStampedImp() {
        // // timeStamp = new Date().getTime();
        // Date date = new Date();
        // SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // //获取当前时间戳到毫秒
        // // timeStamp = System.currentTimeMillis();
        // timeStamp = sbf.format(date);

        Date date = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        timeStamp = dateFormat.format(date);
    }

    @Override
    public String getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered {
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Basic {
    public void set(String val);

    public String get();
}

class BasicImp implements Basic {
    private String value;

    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        return value;
    }
}

class Mixin extends BasicImp implements Timestamped, SerialNumbered {
    private Timestamped timestamped = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberedImp();

    @Override
    public String getStamp() {
        return timestamped.getStamp();
    }

    @Override
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }
}

