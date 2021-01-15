package com.zongyoujifeng.day02.initialization;

import java.util.Arrays;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ArrayInit
 * @description 数组 花括号括起来的列表来初始化对象数组
 * @date 2021/1/15 10:56
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3
        };

        Integer[] b = {
                new Integer(1),
                new Integer(2),
                3
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
