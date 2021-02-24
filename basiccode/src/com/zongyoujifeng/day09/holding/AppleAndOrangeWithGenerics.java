package com.zongyoujifeng.day09.holding;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AppleAndOrangeWithGenerics
 * @description 带泛型
 * @date 2021/2/23 14:02
 */
public class AppleAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
