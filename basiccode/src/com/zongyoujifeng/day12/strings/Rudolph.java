package com.zongyoujifeng.day12.strings;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Rudolph
 * @description 成功匹配字符序列Rudolph
 * @date 2021/3/5 14:17
 */
public class Rudolph {
    public static void main(String[] args) {
        String[] str = {
                "Rudolph", "[rR]udolph",
                "[rR][aeiou][a-z]ol.*",
                "R.*"
        };
        for (String pattern : str) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
