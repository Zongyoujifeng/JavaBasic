package com.zongyoujifeng.day14.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Pair
 * @description TODO
 * @date 2021/5/4 11:24
 */
public class Pair <T>{
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
