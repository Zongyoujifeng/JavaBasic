package com.zongyoujifeng.day06.innerclasses;

import javax.print.attribute.standard.Destination;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel2
 * @description
 * @date 2021/1/20 10:05
 */
public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        //返回一个指向内部类的引用
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
