package com.zongyoujifeng.day12.generics;

import net.mindview.util.Generator;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BasicGeneratorDemo
 * @description 使用BasicGenerator为CounterObject创建一个Generator
 * @date 2021/3/5 21:02
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
