package com.zongyoujifeng.day05.polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Circle
 * @description
 * @date 2021/1/19 8:39
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
