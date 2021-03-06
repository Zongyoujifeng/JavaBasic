package com.zongyoujifeng.day13.generic;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ErasedTypeEquivalence
 * @description c1与c2会被认为相同的类型
 * @date 2021/3/6 14:38
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
