package com.zongyoujifeng.day09.innnerclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName InheritInner
 * @description 内部类的继承
 * @date 2021/2/23 8:59
 */
public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

class WithInner {
    class Inner {
    }
}