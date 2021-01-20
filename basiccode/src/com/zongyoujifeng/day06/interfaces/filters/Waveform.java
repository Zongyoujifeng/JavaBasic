package com.zongyoujifeng.day06.interfaces.filters;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Waveform
 * @description 电子滤波器
 * @date 2021/1/20 8:35
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
