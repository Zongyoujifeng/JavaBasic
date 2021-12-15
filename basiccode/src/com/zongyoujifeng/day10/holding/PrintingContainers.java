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

        // 底层是数组 ArrayList和LinkedList都是按照插入顺序保存元素
        print(fill(new ArrayList<>()));
        print(fill(new LinkedList<>()));

        // Set集合中元素不能重复
        // HashSet是最快获取元素的方式
        print(fill(new HashSet<>()));
        // TreeSet按照比较结果的升序保存元素
        print(fill(new TreeSet<>()));
        // LinkedHashSet按照添加的顺序保存对象
        print(fill(new LinkedHashSet<>()));

        // Map存储的键值对 键不能重复
        print(fill(new HashMap<>()));
        // 按照比较结果的升序保存键
        print(fill(new TreeMap<>()));
        // LinkedHashMap按照插入顺序保存键
        print(fill(new LinkedHashMap<>()));
    }
}
