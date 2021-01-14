package com.zongyoujifeng.day02.initialization;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Exercise8
 * @description 测试使用this关键字
 * @date 2021/1/14 16:51
 */
public class Exercise8 {

    public static void main(String[] args) {
        new Test().func2();
    }
}

class Test{
    void func1() {
        System.out.println("this is func1");
    }
    void func2() {
        func1();
        this.func1();
    }
}

