package com.zongyoujifeng.day04.polymorphism.music;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Wind
 * @description 向上转型
 * @date 2021/1/18 13:26
 */
public class Wind extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

}
