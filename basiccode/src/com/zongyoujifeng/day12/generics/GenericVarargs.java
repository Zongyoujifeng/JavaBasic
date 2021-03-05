package com.zongyoujifeng.day12.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GenericVarargs
 * @description 泛型与可变参数列表能够很好地共存
 * @date 2021/3/5 19:50
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item: args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
