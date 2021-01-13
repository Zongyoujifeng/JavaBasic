package com.zongyoujifeng.day01.operators;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Assignment
 * @description 基本类型的赋值和对象赋值 基本类型的赋值是直接将一个地方的内容复制到了另外一个地方，而对象赋值则是将对象的引用进行赋值
 * @date 2021/1/13 13:33
 */
class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {

        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9;
        t2.level = 47;
        print("1:t1.level:" + t1.level + ",t2.level:" + t2.level);
        //将t2赋值给t1，即将t2对象的引用赋值给t1
        //t1 = t2;
        //避免这种现象方法
        t1.level = t2.level;
        print("2:t1.level:" + t1.level + ",t2.level:" + t2.level);
        //这种现象通常称作“别名现象”
        //修改t1的同时改变了t2
        t1.level = 27;
        print("3:t1.level:" + t1.level + ",t2.level:" + t2.level);


    }
}
