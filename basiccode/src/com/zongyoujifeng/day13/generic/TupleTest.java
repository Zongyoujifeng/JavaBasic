package com.zongyoujifeng.day13.generic;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

/**
 * @author 10451
 * @version 1.0
 * @ClassName TupleTest
 * @description Test Tuple
 * @date 2021/3/6 11:06
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        //Autoboxing converts the int to Integer
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}

class Vehicle {
    @Override
    public String toString() {
        return "Vehicle";
    }
}

class Amphibian {
    @Override
    public String toString() {
        return "Amphibian";
    }
}
