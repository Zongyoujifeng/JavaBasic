package com.zongyoujifeng.day08.innerclass;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AnonymousConstructor
 * @description 在匿名内部类中创建一个构造器的效果
 * @date 2021/2/16 11:00
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {print("Inside instance initializer");}
            @Override
            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);

        base.f();
    }
}

abstract class Base{

    public Base(int i) {
        print("Base Constructor, i = " + i);
    }

    public abstract void f();
}
