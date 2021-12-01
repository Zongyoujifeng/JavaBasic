package com.zongyoujifeng.debugger;

import java.util.Arrays;

/**
 * @author 10451
 * @version 1.0
 * @ClassName TestDebugger
 * @description 调试 F8不会进入方法内部  F7会进入自定义方法中 ALT+Shift+F7第三种会进入方法内部中包括系统内部方法 Shift+F8跳出方法 F9进入下一个断点，如果没有就直接运行到程序结束
 * @date 2021/10/2 17:10
 */
public class TestDebugger {
    public static void main(String[] args) {
        int a = 10;
        int b  = 20;
        int c = 30;
        int [] arr = new int[4];
        arr[0] = 11;
        arr[1] = 56;
        arr[2] = 98;
        arr[3] = 66;
        Arrays.toString(arr);
        int d = eat();
        System.out.println(d);
    }
    public static int eat() {
        System.out.println("---1");
        System.out.println("---2");
        System.out.println("---3");
        System.out.println("---4");
        return 10;
    }
}
