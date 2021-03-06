package com.zongyoujifeng.day13.generic;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 10451
 * @version 1.0
 * @ClassName RandomList
 * @description 构建一个可以应用于各种类型的对象的工具
 * @date 2021/3/6 13:12
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();

    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();

        String s1 = "The quick brown fox jumped over the lazy brown dog";
        for (String s: s1.split(" ")) {
            rs.add(s);
        }
        System.out.println("=============================================");
        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
        }
    }

}
