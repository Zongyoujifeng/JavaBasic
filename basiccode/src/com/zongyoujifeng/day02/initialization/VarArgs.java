package com.zongyoujifeng.day02.initialization;

/**
 * @author 10451
 * @version 1.0
 * @ClassName VarArgs
 * @description 可变参数
 * @date 2021/1/15 11:04
 */
public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "tree"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}

class A {
}