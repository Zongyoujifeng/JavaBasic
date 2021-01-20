package com.zongyoujifeng.day06.innerclasses;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Sequence
 * @description
 * @date 2021/1/20 11:01
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    public class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

interface Selector {
    /**
     * 是否结束
     * @return bool值
     */
    boolean end();

    /**
     * 当前值
     * @return 当前值
     */
    Object current();

    /**
     * 下标增加
     */
    void next();
}
