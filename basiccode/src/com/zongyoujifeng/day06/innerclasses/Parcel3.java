package com.zongyoujifeng.day06.innerclasses;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel3
 * @description
 * @date 2021/1/20 11:48
 */
public class Parcel3 {
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

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        //Must user instance of outer class
        //to create an instance of the inner class
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
