package com.zongyoujifeng.day03.resusing;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Wind
 * @description 向上转型
 * @date 2021/1/18 11:06
 */
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        //upcasting Wind向上转型成Instrument
        Instrument.tune(flute);
    }
}

class Instrument {
    public void play() {
    }
    static void tune(Instrument i) {
        i.play();
    }
}