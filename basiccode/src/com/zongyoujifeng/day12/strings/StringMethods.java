package com.zongyoujifeng.day12.strings;

import java.nio.charset.StandardCharsets;

/**
 * @author 10451
 * @version 1.0
 * @ClassName StringMethods
 * @description String方法
 * @date 2021/3/5 10:38
 */
public class StringMethods {
    public static void main(String[] args) {
        String a = new String(" Malia ");
        String b = new String("Malia Black ");

        boolean equals = a.equals(b);
        boolean equalsIgnoreCase = a.equalsIgnoreCase(b);

        int i = a.compareTo(b);

        //b是否包含a
        boolean contains = b.contains(a);

        //比较两个字符串的内容
        boolean contentEquals = b.contentEquals(a);

        int length = a.length();

        char c = a.charAt(2);

        byte[] bytes = a.getBytes(StandardCharsets.US_ASCII);

        String s = bytes.toString();

        char[] dst = new char[5];

        //从指定位置比较两个字符串的内容
        boolean regionMatches = a.regionMatches(0, b, 0, 5);
        System.out.println("regionMatches: " + regionMatches);
        System.out.println("========================================================================");


        boolean startsWith = a.startsWith("a", 2);
        System.out.println("startWith: " + startsWith);
        System.out.println("========================================================================");

        boolean endsWith = b.endsWith("k");
        System.out.println("endWith: " + endsWith);
        System.out.println("========================================================================");


        int index = b.indexOf("l");
        System.out.println("index:" + index);
        System.out.println("========================================================================");

        int lastIndex = b.lastIndexOf("l");
        System.out.println("lastIndex: " + lastIndex);
        System.out.println("========================================================================");

        String substring = a.substring(2, 5);
        System.out.println("subString: " + substring);
        System.out.println("========================================================================");

        //将源字符串中指定截取的子串复制到目的数组dst中并指定开始的位置
        a.getChars(0, 5, dst, 0);
        System.out.println("复制后,dist:");
        for (char c1 : dst) {
            System.out.print(c1 + " ");
        }
        System.out.println();
        System.out.println("========================================================================");
        String concat = a.concat(b);
        System.out.println("concat: " + concat);
        System.out.println("========================================================================");
        String concat1 = b.concat(a);
        System.out.println("concat1: " + concat1);


        System.out.println("========================================================================");
        String rep = a.replace("a", "k");

        System.out.println("contentEquals: " + contentEquals);
        System.out.println("========================================================================");

        System.out.println("contains:" + contains);
        System.out.println("========================================================================");

        System.out.println("s:" + s + "\nc:" + c + "\nlength:" + length + "\nrep:" + rep);
        System.out.println("========================================================================");
        String upperCase = a.toUpperCase();
        System.out.println("upperCase: " + upperCase);
        System.out.println("========================================================================");
        String lowerCase = a.toLowerCase();
        System.out.println("lowerCase: " + lowerCase);
        System.out.println("========================================================================");

        //a并没有改变
        String trim = a.trim();
        System.out.println("trim: " + trim);
        System.out.println("========================================================================");
        System.out.println("a.concat(b): " + a.concat(b));



    }
}
