package com.zongyoujifeng.day09.holding;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AppleAndOrangeWithoutGenerics
 * @description 使用注解抑制警告信息
 * @date 2021/2/23 13:33
 */
public class AppleAndOrangeWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            //Not prevented from adding an Orange to apples;
            apples.add(new Apple());
        }

        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
        }

    }
}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}