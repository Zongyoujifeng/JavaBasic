package com.zongyoujifeng.day05.polymorphism.shape;

import java.util.Random;

/**
 * @author 10451
 * @version 1.0
 * @ClassName RandomShapeGenerator
 * @description 工厂
 * @date 2021/1/19 8:52
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
