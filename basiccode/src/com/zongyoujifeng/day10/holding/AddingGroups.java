package com.zongyoujifeng.day10.holding;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AddingGroups
 * @description 添加一组元素
 * @date 2021/2/24 13:31
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        //Run significantly faster,but you can't
        //constructs a Collection this way
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        //Produces a list "backed by an array"
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        //Runtime error because the underlying array cannot be resized
        // list.add(21);
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.print(integerListIterator.next() + " ");
        }

        for (Integer integer : collection) {
            System.out.print(integer + " ");
        }

    }
}
