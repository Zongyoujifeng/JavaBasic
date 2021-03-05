package com.zongyoujifeng.day12.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ReFlags
 * @description 通过“或”(|)操作符组合多个标记的功能
 * @date 2021/3/5 15:45
 */
public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher("Java has regex\njava has regex\n" +
                "JAVA has pretty regular expressions\n" +
                "Regular expressions are in Java");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
