package com.zongyoujifeng.day01.initialization;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SimpleConstructor
 * @description 带构造器的简单类
 * @date 2021/1/13 22:56
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //创建对象时将对象分配空间，并调用相应的构造器，确保在操作对象之前
            //对象已经被恰当地初始化了
            new Rock();
        }
    }
}

class Rock {
    /**
     * 构造器必须采用与类相同的名称
     * 初始化期间要自动调用构造器
     * 不接受任何参数的构造器叫做默认构造器
     */
    Rock() {
        System.out.println("Rock ");
    }
}