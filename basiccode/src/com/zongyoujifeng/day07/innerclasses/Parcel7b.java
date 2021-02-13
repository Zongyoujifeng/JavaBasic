package com.zongyoujifeng.day07.innerclasses;

import com.zongyoujifeng.day06.innerclasses.Contents;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel7b
 * @description Expanded version of Parcel7
 * @date 2021/1/22 17:27
 */
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
