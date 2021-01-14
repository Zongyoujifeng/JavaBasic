package com.zongyoujifeng.day02.initialization;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Flower
 * @description this的另一种用法
 * @date 2021/1/14 16:56
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only.petalCount= " + petalCount);
    }

    Flower(String ss) {
        print("Constructor w/ String arg only.s= " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        // this(s); //can't call two!
        //another use of this
        this.s = s;
        print("String && int args");
    }

    Flower() {
        this("hi", 46);
        print("default constructor (no args)");
    }

    void printPetalCount() {
        //this(11);//Not inside non-constructor!
        print("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
