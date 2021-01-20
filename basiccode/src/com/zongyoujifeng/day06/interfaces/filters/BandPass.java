package com.zongyoujifeng.day06.interfaces.filters;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BandPass
 * @description 带通
 * @date 2021/1/20 8:41
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
