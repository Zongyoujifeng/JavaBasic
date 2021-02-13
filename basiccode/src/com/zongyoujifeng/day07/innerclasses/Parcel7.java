package com.zongyoujifeng.day07.innerclasses;

import com.zongyoujifeng.day06.innerclasses.Contents;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel7
 * @description Returning an instance of an anonymous inner class 匿名内部类
 * @date 2021/1/22 17:23
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };//Semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
