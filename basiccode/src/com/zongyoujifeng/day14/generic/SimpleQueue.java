package com.zongyoujifeng.day14.generic;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SimpleQueue
 * @description
 * @date 2021/5/3 10:35
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void add(T t) {
        storage.offer(t);
    }
    public T get() {
        return storage.poll();
    }
    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
