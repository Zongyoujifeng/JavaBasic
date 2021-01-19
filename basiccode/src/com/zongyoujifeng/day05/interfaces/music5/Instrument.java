package com.zongyoujifeng.day05.interfaces.music5;

import com.zongyoujifeng.day05.polymorphism.music3.Note;

/**
 * @author 10451
 * @version 1.0
 * @InterfaceName Instrument
 * @description 接口
 * @date 2021/1/19 12:34
 */
public interface Instrument {
    /**
     * 默认static final
     */
    int VALUE = 5;

    //cannot have method definitions:

    void play(Note n);

    void adjust();
}
