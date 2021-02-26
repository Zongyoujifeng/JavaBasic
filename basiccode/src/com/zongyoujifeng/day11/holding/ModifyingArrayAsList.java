package com.zongyoujifeng.day11.holding;

import java.util.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ModifyingArrayAsList
 * @description 打乱Arrays.asList()产生的List，会修改底层的数组
 * @date 2021/2/26 23:37
 */
public class ModifyingArrayAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        System.out.println("Before shuffling: " + list1);
        Collections.shuffle(list1, rand);
        System.out.println("After shuffling: " + list1);
        System.out.println("array: " + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffling: " + list2);
        Collections.shuffle(list2, rand);
        System.out.println("After shuffling: " + list2);
        System.out.println("array: " + Arrays.toString(ia));
    }
}
