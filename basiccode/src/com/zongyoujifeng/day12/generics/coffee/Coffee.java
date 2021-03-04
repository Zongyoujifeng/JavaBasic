package com.zongyoujifeng.day12.generics.coffee;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Coffee
 * @description Coffee
 * @date 2021/3/4 16:27
 */
public class Coffee {
    public static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}


