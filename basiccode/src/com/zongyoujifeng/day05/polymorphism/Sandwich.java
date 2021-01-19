package com.zongyoujifeng.day05.polymorphism;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Sandwich
 * @description 构造器和多态
 * @date 2021/1/19 10:26
 */
public class Sandwich extends PortableLunch {

    private Bread b = new Bread();
    private Chess c = new Chess();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

class Meal {
    public Meal() {
        print("Meal()");
    }
}

class Bread {
    public Bread() {
        print("Bread()");
    }
}

class Chess{
    public Chess() {
        print("Chess()");
    }
}

class Lettuce{
    public Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal {
    public Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    public PortableLunch() {
        print("PortableLunch()");
    }
}