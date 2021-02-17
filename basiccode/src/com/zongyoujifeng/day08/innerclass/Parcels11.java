package com.zongyoujifeng.day08.innerclass;

import com.zongyoujifeng.day06.innerclasses.Contents;
import com.zongyoujifeng.day06.innerclasses.Destination;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcels11
 * @description 嵌套类
 * @date 2021/2/17 14:13
 */
public class Parcels11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        //Nested classes can contain other static elements
        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
