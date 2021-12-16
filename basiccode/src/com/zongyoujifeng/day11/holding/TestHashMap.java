package com.zongyoujifeng.day11.holding;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rat");
        list.add("Manx");
        list.add("Cymric");
        list.add("Mutt");
        list.add("Cymric");
        list.add("Pug");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("**********************************************************");
        Set<String> set = new HashSet<>(list);
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
    }
}
