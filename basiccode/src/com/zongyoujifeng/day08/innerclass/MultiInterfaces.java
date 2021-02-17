package com.zongyoujifeng.day08.innerclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MultiInterfaces
 * @description 必须在一个类中以某种方式实现两个接口，由于接口地灵活，有俩选择：①使用单一类②使用内部类
 * @date 2021/2/17 19:58
 */
public class MultiInterfaces {
    static void takesA(A a) {
    }

    static void takesB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}


interface A {
}

interface B {
}

class X implements A, B {
}

class Y implements A {
    B makeB() {
        //Anonymous inner class
        return new B() {
        };
    }
}