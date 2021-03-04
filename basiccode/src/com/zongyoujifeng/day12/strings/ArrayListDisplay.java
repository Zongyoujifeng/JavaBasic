package com.zongyoujifeng.day12.strings;

import com.zongyoujifeng.day12.generics.coffee.Coffee;
import com.zongyoujifeng.day12.generics.coffee.CoffeeGenerator;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ArrayListDisplay
 * @description 无意识的递归
 * @date 2021/3/4 17:55
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        for (Coffee c: new CoffeeGenerator(10)) {
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
