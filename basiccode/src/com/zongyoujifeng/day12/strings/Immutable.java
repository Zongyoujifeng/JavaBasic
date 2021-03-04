package com.zongyoujifeng.day12.strings;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Immutable
 * @description 不可变String
 * @date 2021/3/4 15:10
 */
public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q);

        String qq = upcase(q);
        print(qq);
        print(q);
    }

}
