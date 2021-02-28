package com.zongyoujifeng.day12.exceptions;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MultipleReturns
 * @description 在return中使用finally
 * @date 2021/2/27 22:44
 */
public class MultipleReturns {
    public static void f(int i) {
        print("Initialization that requires cleanup");

        try {
            print("Point 1");
            if (i == 1) {
                return;
            }

            print("Point 2");
            if (i == 2) {
                return;
            }

            print("Point 3");
            if (i == 3) {
                return;
            }

            print("End");
            return;
        } finally {
            print("Performing cleanup");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            f(i);
            print("==========================================================================");
        }
    }
}
