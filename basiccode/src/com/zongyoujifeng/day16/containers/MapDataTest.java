package com.zongyoujifeng.day16.containers;

import net.mindview.util.*;

import java.util.Iterator;

import static net.mindview.util.Print.print;

public class MapDataTest {
    public static void main(String[] args) {
        // Pair generator
        print(MapData.map(new Letters(), 11));
        // Two separate generators
        print(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3), 8));
        // A key Generator and a single value
        print(MapData.map(new CountingGenerator.Character(), "Value", 6));
        // An Iterable and a value Generator
        print(MapData.map(new Letters(), new RandomGenerator.String(3)));
        // An Iterable and a single value
        print(MapData.map(new Letters(), "Pop"));
    }
}

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
