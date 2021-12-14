package com.zongyoujifeng.day10.holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SimpleCollection
 * @description Collection接口
 * @date 2021/2/24 9:49
 */
public class SimpleCollection {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();
        // 使用Integer对象填充Collection
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer item : c) {
            System.out.print(item + ", ");
        }
    }
}
