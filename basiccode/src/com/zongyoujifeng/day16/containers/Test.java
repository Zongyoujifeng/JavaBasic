package com.zongyoujifeng.day16.containers;

public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }
    abstract int test(C container, TestParam tp);
}
