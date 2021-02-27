package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName WhoCalled
 * @description 栈轨迹
 * @date 2021/2/27 13:22
 */
public class WhoCalled {
    static void f() {
        //Generate an Exception to fill in the stack trace information
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("-----------------------------------------");
        g();
        System.out.println("-----------------------------------------");
        h();
    }
}
