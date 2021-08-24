package com.zongyoujifeng.day15.collections;

/**
 * @author 10451
 * @version 1.0
 * @ClassName CircularArrayQueue
 * @description TODO
 * @date 2021/7/27 14:28
 */
public class CircularArrayQueue<E> implements Queue<E>{

    private int head;

    private int trail;

     CircularArrayQueue(int capacity) {
        this.head = capacity;
    }

    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    private E[] elements;
}
