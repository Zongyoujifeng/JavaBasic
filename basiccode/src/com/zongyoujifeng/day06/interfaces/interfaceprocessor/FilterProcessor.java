package com.zongyoujifeng.day06.interfaces.interfaceprocessor;

import com.zongyoujifeng.day06.interfaces.filters.BandPass;
import com.zongyoujifeng.day06.interfaces.filters.HighPass;
import com.zongyoujifeng.day06.interfaces.filters.LowPass;
import com.zongyoujifeng.day06.interfaces.filters.Waveform;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName FilterProcessor
 * @description
 * @date 2021/1/20 8:59
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
