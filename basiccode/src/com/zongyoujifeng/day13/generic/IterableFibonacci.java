package com.zongyoujifeng.day13.generic;

import com.zongyoujifeng.day12.generics.Fibonacci;

import java.util.Iterator;

/**
 * @author 10451
 * @version 1.0
 * @ClassName IterableFibonacci
 * @description 通过继承来创建适配器类
 * @date 2021/3/6 13:26
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int count;

    public IterableFibonacci(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                count--;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }

    public static void main(String[] args) {
        for (int i: new IterableFibonacci(18)) {
            System.out.print(i + " ");
        }
    }

}
