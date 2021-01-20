package com.zongyoujifeng.day06.interfaces.filters;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Filter
 * @description
 * @date 2021/1/20 8:37
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
