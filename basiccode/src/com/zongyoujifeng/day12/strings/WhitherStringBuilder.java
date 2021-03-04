package com.zongyoujifeng.day12.strings;

/**
 * @author 10451
 * @version 1.0
 * @ClassName WhitherStringBuilder
 * @description StringBuilder
 * @date 2021/3/4 15:14
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
        }
        return result.toString();
    }
}
