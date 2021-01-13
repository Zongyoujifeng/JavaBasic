package com.zongyoujifeng.day01.method;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MethodDemoFirst
 * @description 第一个Java方法Demo
 * @date 2021/1/13 12:22
 */
public class MethodDemoFirst {
    /**
     * Java main()方法是静态方法调用外部方法需要使用static修饰
     */
    public static void methodDemo() {
        System.out.println("第一个Java方法");
    }
    public static void main(String[] args) {
        System.out.println("调用第一个Java方法");
        methodDemo();
    }
}
