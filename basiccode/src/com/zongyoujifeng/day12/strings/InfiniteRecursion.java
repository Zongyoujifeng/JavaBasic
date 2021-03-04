package com.zongyoujifeng.day12.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName InfiniteRecursion
 * @description 打印对象的内存地址
 * @date 2021/3/4 21:46
 */
public class InfiniteRecursion {

    /**
     * 打印对象地址不能使用this 必须使用super.toString，
     * 使用this会发生自动类型转换，InfiniteRecursion类型会转成String类型，
     * 如此会调用this上的toString()，于是发生递归调用
     *
     * @return toString
     */
    @Override
    public String toString() {

        // java.lang.StackOverflowError
        // return "InfiniteRecursion address: " + this + "\n";
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
