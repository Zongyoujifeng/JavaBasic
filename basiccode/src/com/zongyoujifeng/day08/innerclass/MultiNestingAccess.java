package com.zongyoujifeng.day08.innerclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MultiNestingAccess
 * @description 从多层嵌套类中访问外部类成员
 * @date 2021/2/17 16:04
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}

class MNA {
    private void f() {}

    class A {
        private void g() {

        }
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}