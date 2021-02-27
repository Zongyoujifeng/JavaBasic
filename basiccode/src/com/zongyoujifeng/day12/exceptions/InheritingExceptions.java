package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName InheritingExceptions
 * @description 自定义异常
 * @date 2021/2/27 0:12
 */
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}

class SimpleException extends Exception {
}