package com.zongyoujifeng.day12.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Finding
 * @description 在CharSequence中查找多个匹配
 * @date 2021/3/5 15:22
 */
public class Finding {
    public static void main(String[] args) {
        CharSequence input;
        String reg = "\\w+";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher("Evening is full of the linnet's wings");

        while (m.find()) {
            printnb(m.group() + " ");
        }

        print();

        int i = 0;
        while (m.find(i)) {
            printnb(m.group() + " ");
            i++;
        }

        System.out.println();
        String reg1 = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern p1 = Pattern.compile(reg1);
        Matcher matcher = p1.matcher("Arline ate eight apples and one orange while Anita hadn't any");

        while (matcher.find(i)) {
            printnb(matcher.group() + " ");
            i++;
        }
    }
}
