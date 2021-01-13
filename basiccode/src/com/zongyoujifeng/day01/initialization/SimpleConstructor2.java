package com.zongyoujifeng.day01.initialization;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SimpleConstructor
 * @description 含参构造器
 * @date 2021/1/13 22:56
 */
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //创建对象时将对象分配空间，并调用相应的构造器，确保在操作对象之前
            //对象已经被恰当地初始化了
            new Rock2(i);
        }
    }
}

class Rock2 {
    /**
     * 构造器必须采用与类相同的名称
     * 构造器是一种特殊类型的方法，因为它没有返回值
     *
     */
    Rock2(int i) {
        System.out.println("Rock " + i);
    }
}