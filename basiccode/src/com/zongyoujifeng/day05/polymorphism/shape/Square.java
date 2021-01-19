package com.zongyoujifeng.day05.polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Square
 * @description
 * @date 2021/1/19 8:50
 */
public class Square extends Circle{
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
}
