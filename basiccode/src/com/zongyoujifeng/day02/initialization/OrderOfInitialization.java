package com.zongyoujifeng.day02.initialization;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName OrderOfInitialization
 * @description 初始化顺序
 * @date 2021/1/15 9:27
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}

class Window {
    Window(int marker) {
        print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);
    House() {
        print("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        print("f()");
    }
    /**
     *  第一次引用对象将会被丢弃
     */
    Window w3 = new Window(3);
}