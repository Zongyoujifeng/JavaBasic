package com.zongyoujifeng.day13.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ArrayOfGenericReference
 * @description 按照编译器喜欢的方式来定义一个引用
 * @date 2021/3/6 15:48
 */
public class ArrayOfGenericReference {
    static Generic<Integer>[] gia;
}

class Generic<T> {}
