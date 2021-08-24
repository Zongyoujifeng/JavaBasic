package com.zongyoujifeng.day01.operators;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Literals
 * @description TODO
 * @date 2021/8/24 16:18
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        // System.out.println("i1:");
        print("i1: " + Integer.toBinaryString(i1));
        // 十六进制
        int i2 = 0X2F;
        print("i2: " + Integer.toBinaryString(i2));
        // 八进制
        int i3 = 0177;
        print("i3:() " + Integer.toBinaryString(i3));
        // print("i3:" + 7+7*8+1*8*8);
    }
}
