package com.zongyoujifeng.day07.innerclasses;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel8
 * @description Calling the base-class constructor
 * @date 2021/1/22 17:32
 */
public class Parcel8 {
   public Wrapping wrapping(int x) {
       //Base constructor call;
       return new Wrapping(x) {
           @Override
           public int value() {
               return super.value() * 47;
           }
       };
   }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
