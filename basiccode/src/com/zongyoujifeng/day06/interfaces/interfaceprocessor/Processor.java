package com.zongyoujifeng.day06.interfaces.interfaceprocessor;

/**
 * @author 10451
 * @version 1.0
 * @InterfaceName Processor
 * @description 处理器
 * @date 2021/1/20 8:44
 */
public interface Processor {
    /**
     * 名字
     * @return
     */
    String name();

    /**
     * 如何处理
     * @param input 输入
     * @return
     */
    Object process(Object input);
}
