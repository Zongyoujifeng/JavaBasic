package com.zongyoujifeng.day01.operators;

/**
 * @author 10451
 * @version 1.0
 * @ClassName EqualsMethod2
 * @description Default equals() does not compare contents.equals()默认行为是比较对象的引用
 * @date 2021/1/13 19:57
 */
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        //false
        System.out.println(v1.equals(v2));
    }
}

class Value {
    int i;
}