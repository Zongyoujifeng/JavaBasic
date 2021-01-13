package com.zongyoujifeng.day01.operators;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AutoInc
 * @description 自动递增和递减
 * @date 2021/1/13 19:40
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i:" + i);
        print("++i：" + ++i);
        print("i++：" + i++);
        print("i:" + i);
        print("--i：" + --i);
        print("i--：" + i--);
        print("i:" + i);
    }
}
