package com.zongyoujifeng.day06.interfaces.interfaceprocessor;

import com.zongyoujifeng.day06.interfaces.filters.Filter;
import com.zongyoujifeng.day06.interfaces.filters.Waveform;

/**
 * @author 10451
 * @version 1.0
 * @ClassName FilterAdapter
 * @description 适配器
 * @date 2021/1/20 8:56
 */
public class FilterAdapter implements Processor{
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
