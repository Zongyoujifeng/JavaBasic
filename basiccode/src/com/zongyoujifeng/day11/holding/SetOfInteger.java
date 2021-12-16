package com.zongyoujifeng.day11.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SetOfInteger
 * @description Set 不保存重复的元素
 * @date 2021/2/26 15:29
 */
public class SetOfInteger {
    public static void main(String[] args) {

        Random rand = new Random(100);
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intSet.add(rand.nextInt(100000000));
        }
        System.out.println(intSet);

        //哈希表初始长度16，负载因子时0.75
        Set<Integer> set = new HashSet<>();
        //1%16=1
        set.add(1);
        //2%16=2
        set.add(2);
        //16%16=0
        set.add(16);
        //17%16=1
        set.add(17);
        set.add(33);
        set.add(14);
        set.add(21);
        set.add(31);
        set.add(41);
        set.add(51);
        set.add(61);
        set.add(54);
        set.add(32);
        System.out.println(set);
    }
}
