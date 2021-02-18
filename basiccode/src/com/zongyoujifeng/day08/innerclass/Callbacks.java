package com.zongyoujifeng.day08.innerclass;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Callbacks
 * @description 闭包与回调
 * @date 2021/2/18 15:11
 */
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());

        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}

interface Incrementable {
    /**
     * 方法
     */
    void increment();
}

/**
 * Very simple to just implement the interface
 */
class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        print(i);
    }
}

class MyIncrement {
    public void increment() {
        print("Other operation");
    }
    static void f(MyIncrement mi) {
        mi.increment();
    }
}

//If you must implement increment() in
//some other way, you must use an inner class

class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        i++;
        print(i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            //Specify outer-class method,otherwise
            //you'd get an infinite recursion
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}


