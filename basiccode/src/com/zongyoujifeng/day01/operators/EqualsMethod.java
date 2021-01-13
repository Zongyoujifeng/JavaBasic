package com.zongyoujifeng.day01.operators;

/**
 * @author 10451
 * @version 1.0
 * @ClassName EqualsMethod
 * @description equals()比较两个对象
 * @date 2021/1/13 19:54
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        //equals方法不适用与基本类型
        System.out.println(n1.equals(n2));
    }
}
