package com.zongyoujifeng.day05.interfaces.music;

import com.zongyoujifeng.day05.polymorphism.music3.Note;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Instrument
 * @description 抽象类
 * @date 2021/1/19 11:31
 */
abstract class Instrument {
    private int i;

    /**
     * 演奏
     * @param n 枚举值
     */
    public abstract void play(Note n);
    public String what() {
        return "Instrument";
    }

    /**
     *
     */
    public abstract void adjust();

}
