package com.zongyoujifeng.day12.strings;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Replacing
 * @description 替换
 * @date 2021/3/5 14:11
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        //找到第一个以f开头后面跟着一个或多个字母的部分
        // 然后用"located"代替
        print(s.replaceFirst("f\\w+", "located"));
        //匹配三个单词中的任意一个，替换所有匹配的部分
        print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
