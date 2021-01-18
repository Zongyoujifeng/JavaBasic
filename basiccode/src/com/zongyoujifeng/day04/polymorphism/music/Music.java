package com.zongyoujifeng.day04.polymorphism.music;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Music
 * @description 向上转型
 * @date 2021/1/18 13:28
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
