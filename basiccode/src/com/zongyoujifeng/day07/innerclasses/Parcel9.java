package com.zongyoujifeng.day07.innerclasses;

import com.zongyoujifeng.day06.innerclasses.Destination;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel9
 * @description A briefer version of Parcel5
 * @date 2021/1/22 17:43
 */
public class Parcel9 {
    /**
     * Arguments must be final to use inside
     * anonymous class
    */
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
