package com.zongyoujifeng.day01.initialization;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Overloading
 * @description 重载构造器和重载方法
 * @date 2021/1/13 23:20
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
            new Tree();
        }
    }
}

class Tree {
    int height;

    /**
     * 默认构造器
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * 方法重载是构造器所必须的
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }
    void info(String s) {
        print(s + ":Tree is " + height + " feet tall");
    }
}