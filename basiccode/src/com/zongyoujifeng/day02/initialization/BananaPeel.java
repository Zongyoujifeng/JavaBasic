package com.zongyoujifeng.day02.initialization;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BananaPeel
 * @description this关键字
 * @date 2021/1/14 10:36
 */
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();
        //编译器暗自把“所操作对象的引用”作为第一个参数传递给peel()
        a.peel(1);
        b.peel(2);
    }
}

class Banana {
    void peel(int i) {
        System.out.println(i);
    }
}