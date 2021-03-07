package com.zongyoujifeng.day13.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GenericWriting
 * @description 超类型边界
 * @date 2021/3/7 9:28
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Fruit> fruit = new ArrayList<>();

    static List<Apple> apples = new ArrayList<>();

    static void f1() {
        writeExact(apples, new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item){
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
