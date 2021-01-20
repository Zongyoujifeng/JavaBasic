package com.zongyoujifeng.day06.interfaces.interfaceprocessor;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Apply
 * @description
 * @date 2021/1/20 8:46
 */
public class Apply{
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
