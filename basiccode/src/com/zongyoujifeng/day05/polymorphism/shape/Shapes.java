package com.zongyoujifeng.day05.polymorphism.shape;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Shapes
 * @description
 * @date 2021/1/19 8:55
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for (int i = 0; i < s.length; i++) {
            //每次调用next方法时，具体类型时未知的，因为我们总是能够获得一个通用的Shape引用
            s[i] = gen.next();
        }

        for (Shape shp : s
        ) {
            shp.draw();
        }
    }
}
