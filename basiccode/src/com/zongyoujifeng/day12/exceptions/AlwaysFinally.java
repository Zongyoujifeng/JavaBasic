package com.zongyoujifeng.day12.exceptions;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AlwaysFinally
 * @description Finally is always executed
 * @date 2021/2/27 20:17
 */
public class AlwaysFinally {
    public static void main(String[] args) {
        print("Entering first try block");

        try {
            print("Entering second try block");

            try {
                throw new FourException();
            } finally {
                print("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try blockfm tghr");
        }
    }
}


class FourException extends Exception {
}