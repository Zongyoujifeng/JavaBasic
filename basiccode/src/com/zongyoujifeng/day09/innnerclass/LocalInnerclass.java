package com.zongyoujifeng.day09.innnerclass;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author 10451
 * @version 1.0
 * @ClassName LocalInnerclass
 * @description 局部内部类
 * @date 2021/2/23 10:57
 */
public class LocalInnerclass {
    private int count = 0;
    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                //Local inner class can have constructor
                print("LocalCounter()");
            }

            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            //Anonymous inner class cannot have a named
            //constructor,only an instance initializer
            {
                print("Counter");
            }
            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerclass lic = new LocalInnerclass();
        Counter c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            print(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            print(c2.next());
        }
    }
}

interface Counter {
    int next();
}

