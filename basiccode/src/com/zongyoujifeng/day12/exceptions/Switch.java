package com.zongyoujifeng.day12.exceptions;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Switch
 * @description finally用来做什么
 * @date 2021/2/27 19:41
 */
public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        print(this);
    }

    public void off() {
        state = false;
        print(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}
