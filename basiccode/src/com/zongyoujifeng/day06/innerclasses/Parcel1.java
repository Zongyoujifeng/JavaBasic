package com.zongyoujifeng.day06.innerclasses;

import javax.print.attribute.standard.Destination;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel1
 * @description 例子1
 * @date 2021/1/20 9:46
 */
public class Parcel1 {
    class Contents {
        private int i = 1;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
