package com.zongyoujifeng.day11.holding;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SetOperation
 * @description
 * @date 2021/2/26 15:44
 */
public class SetOperation {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        set1.add("M");

        print("H: " + set1.contains("H"));
        print("N: " + set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        print("set1: " + set1);
        print("set2: " + set2);
        print("set2 in set1:" + set1.containsAll(set2));
        set1.remove("H");

        print("set1: " + set1);
        print("set2: " + set2);
        print("set2 in set1:" + set1.containsAll(set2));
        set1.removeAll(set2);
        print("set2 removed from set1: " + set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        print("'X Y Z' added to set1: " + set1);
    }
}
