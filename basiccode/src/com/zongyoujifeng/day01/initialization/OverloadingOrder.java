package com.zongyoujifeng.day01.initialization;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName OverloadingOrder
 * @description 区分重载方法
 * @date 2021/1/13 23:32
 */
public class OverloadingOrder {
    /**
     * 参数类型不同，顺序不通过，个数不同可区分两个方法
     * @param s
     * @param i
     */
    static void f(String s, int i) {
        print("String:" + s + ",int :" + i);
    }

    static void f(int i, String s) {
        print("int:" + i + "String:" + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
