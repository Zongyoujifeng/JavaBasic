package com.zongyoujifeng.day01.operators;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName PassObject
 * @description 方法调用中的别名问题
 * @date 2021/1/13 15:11
 */
public class PassObject {

    static void f(Letter x) {
        x.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1:x.c:" + x.c);
        //传递了x对象的引用
        f(x);
        print("2:x.c:" + x.c);
    }
}

class Letter {
    char c;
}
