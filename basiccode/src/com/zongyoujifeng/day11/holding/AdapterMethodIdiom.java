package com.zongyoujifeng.day11.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AdapterMethodIdiom
 * @description 适配器
 * @date 2021/2/26 22:13
 */
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        //Grabs the ordinary iterator via iterator()
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        //Hand it the Iterable of your choice
        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }

}


class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<? extends T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {

            @Override
            public Iterator<T> iterator() {

                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                    @Override
                    public void remove() {
                        //No implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}