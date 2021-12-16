package com.zongyoujifeng.day11.holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SortedSetOfInteger
 * @description
 * @date 2021/2/26 15:33
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intSet = new TreeSet<>();

        for (int i = 0; i < 10000; i++) {
            intSet.add(rand.nextInt(30));
        }
        System.out.println(intSet);
    }
}
