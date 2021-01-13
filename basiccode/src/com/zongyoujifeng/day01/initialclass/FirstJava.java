package com.zongyoujifeng.day01.initialclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName FirstJava
 * @description HelloJava入门程序
 * @date 2021/1/13 12:13
 */
public class FirstJava {
    /**
     * public 指这是一个可由外部定义的方法
     * static 意味着这个域或方法不会与包含它的类的任何对象实例关联在一起
     * 即使从未创建某个类的任何对象，也可以调用其static方法或者访问其static域
     * 类方法（静态方法）static修饰的方法代表这个方法是作为整个类存在而不是作为类的某个特定对象而存在的
     * @param args main方法的String类型的数组参数args用来存储命令行参数
     */
    public static void main(String[] args) {
        System.out.println("First Java program.Hello Java!");
    }
}
