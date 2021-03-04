package com.zongyoujifeng.day12.generics;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Holder1
 * @description 持有单个对象的类
 * @date 2021/3/4 15:34
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    public Automobile getA() {
        return a;
    }
}

class Automobile {
}
