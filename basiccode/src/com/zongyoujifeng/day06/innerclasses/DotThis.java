package com.zongyoujifeng.day06.innerclasses;

/**
 * @author 10451
 * @version 1.0
 * @ClassName DotThis
 * @description
 * @date 2021/1/20 11:42
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
