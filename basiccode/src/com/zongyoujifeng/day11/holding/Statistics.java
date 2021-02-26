package com.zongyoujifeng.day11.holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Statistics
 * @description 使用Map测试Random的随机性
 * @date 2021/2/26 18:57
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
