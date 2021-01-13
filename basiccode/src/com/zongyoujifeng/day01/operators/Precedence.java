package com.zongyoujifeng.day01.operators;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Precedence
 * @description 运算符优先级 先乘除后加减
 * @date 2021/1/13 13:21
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        //(1) 5
        int a = x + y - 2 / 2 + z;
        //(2) 1
        int b = x + (y - 2) / (2 + z);
        //“+”操作符意味着字符串的连接
        print("a = " + a + ",b = " + b);
    }
}
