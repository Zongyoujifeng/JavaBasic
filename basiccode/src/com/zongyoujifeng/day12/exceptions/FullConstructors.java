package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName FullConstructors
 * @description 为异常类定义一个接受字符串参数的构造器
 * @date 2021/2/27 10:45
 */
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originate in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            //信息被发送到了System.out，并自动地被捕获和显示在输出中。
            // 但是，如果调用默认版本
            // {@code e.printStackTrace();}则信息将被输出到标准错误流
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}