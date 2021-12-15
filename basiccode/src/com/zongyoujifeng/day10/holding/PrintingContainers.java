package com.zongyoujifeng.day10.holding;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName PrintingContainers
 * @description 容器
 * @date 2021/2/25 11:57
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "spot");
        return map;
    }

    public static void main(String[] args) {

        // 底层是数组
        print(fill(new ArrayList<>()));

        print(fill(new LinkedList<>()));

        print(fill(new HashSet<>()));

        print(fill(new TreeSet<>()));

        print(fill(new LinkedHashSet<>()));

        print(fill(new HashMap<>()));

        print(fill(new TreeMap<>()));

        print(fill(new LinkedHashMap<>()));
    }
}
