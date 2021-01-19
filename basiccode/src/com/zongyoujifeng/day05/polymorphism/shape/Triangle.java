package com.zongyoujifeng.day05.polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Triangle
 * @description 多态
 * @date 2021/1/19 8:51
 */
public class Triangle extends Shape{
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}
