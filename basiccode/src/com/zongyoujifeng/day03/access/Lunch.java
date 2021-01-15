package com.zongyoujifeng.day03.access;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Lunch
 * @description 类的访问权限
 * @date 2021/1/15 12:48
 */
public class Lunch {
    void testPrivate() {
        // Soup1 soup = new Soup1();//Can't do this!Private constructor
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}

class Soup1 {
    private Soup1() {
    }
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

