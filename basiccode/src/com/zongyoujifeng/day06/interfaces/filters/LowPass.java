package com.zongyoujifeng.day06.interfaces.filters;

/**
 * @author 10451
 * @version 1.0
 * @ClassName LowPass
 * @description 低通
 * @date 2021/1/20 8:38
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
