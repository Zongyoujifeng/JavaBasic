package com.zongyoujifeng.day01.operators;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Equivalence
 * @description 关系操作符测试对象等价性
 * @date 2021/1/13 19:49
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(42);
        Integer n2 = new Integer(42);
        //== != 比较的是对象的引用
        //false
        System.out.println(n1 == n2);
        //true
        System.out.println(n1 != n2);
    }
}
