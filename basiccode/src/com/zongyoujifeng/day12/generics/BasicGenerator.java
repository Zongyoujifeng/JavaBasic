package com.zongyoujifeng.day12.generics;

import net.mindview.util.Generator;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BasicGenerator
 * @description 通用的generator提供一个基本实现，
 * 用以生成某个类的对象
 * @date 2021/3/5 20:22
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            //Assumes type is a public class:
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Produce a Default generator given a type token.
     * @param type 类型
     * @param <T> 类型
     * @return 返回
     */
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }
}
