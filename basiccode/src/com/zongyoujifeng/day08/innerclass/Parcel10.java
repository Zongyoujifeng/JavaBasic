package com.zongyoujifeng.day08.innerclass;

import com.zongyoujifeng.day06.innerclasses.Destination;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel10
 * @description 内部类的参数 内部类模仿构造器 采用实例初始化
 * @date 2021/2/16 11:14
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price){
        return new Destination() {
            private int cost;
            //Instance initialization for each object
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget");
                }
            }

            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}
