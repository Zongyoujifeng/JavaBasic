package com.zongyoujifeng.day12.generics;

/**
 * @author 10451
 * @version 1.0
 * @ClassName CountedObject
 * @description 记录创建了多少个CountObject实例，
 * 并通过toString()方法告诉我们编号
 * @date 2021/3/5 20:59
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject{" +
                "id=" + id +
                '}';
    }
}
