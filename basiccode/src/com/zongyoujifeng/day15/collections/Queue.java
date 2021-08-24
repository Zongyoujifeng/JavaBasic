package com.zongyoujifeng.day15.collections;

/**
 * @author 10451
 * @version 1.0
 * @InterfaceName Queue
 * @description TODO
 * @date 2021/7/27 14:26
 */
public interface Queue<E> {

    void add(E element);

    E remove();

    int size();
}
