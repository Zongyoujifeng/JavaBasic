package com.zongyoujifeng.day06.interfaces.filters;

/**
 * @author 10451
 * @version 1.0
 * @ClassName HighPass
 * @description 高通
 * @date 2021/1/20 8:40
 */
public class HighPass extends Filter {
    double cutoff;


    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
