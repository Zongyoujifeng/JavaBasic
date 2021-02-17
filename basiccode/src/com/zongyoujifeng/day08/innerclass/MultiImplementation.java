package com.zongyoujifeng.day08.innerclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MultiImplementation
 * @description 如果拥有的是抽象的类或具体的类，而不是接口，那就只能使用内部类才能实现多重继承
 * @date 2021/2/17 20:06
 */
public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

class D {
}

abstract class E {
}
class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}