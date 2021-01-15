package com.zongyoujifeng.day03.resusing;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SprinklerSystem
 * @description 组合语法
 * @date 2021/1/15 17:37
 */
public class SprinklerSystem {
    private String value1, value2, value3, value4;

    private WaterSource source = new WaterSource();

    private int i;
    private float f;

    @Override
    public String toString() {
        return
                "value1 = " + value1 +
                " value2 = " + value2 +
                " value3 = " + value3 +
                " value4 = " + value4 + "\n" +
                "i = " + i + " f = " + f + " source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}