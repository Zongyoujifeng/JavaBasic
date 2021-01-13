package net.mindview.util;

import java.io.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Print
 * @description 简短打印语句
 * @date 2021/1/13 13:01
 */
public class Print {
    /**
     * Print with a newline:
     * @param obj 输出内容
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * Print a newline by itself:
     */
    public static void print() {
        System.out.println();
    }

    /**
     * Print with no line break:
     * @param obj 输出内容
     */
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    /**
     * The new Java SE5 printf() (from C):
     * @param format 格式输出
     * @param args 形式参数
     * @return JavaSE5新特性
     */
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
