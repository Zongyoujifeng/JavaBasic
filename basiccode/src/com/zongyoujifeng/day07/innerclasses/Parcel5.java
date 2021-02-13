package com.zongyoujifeng.day07.innerclasses;

import com.zongyoujifeng.day06.innerclasses.Destination;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel5
 * @description Nesting a class within a method
 * @date 2021/1/22 17:09
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private final String label;

            public PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
