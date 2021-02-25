package com.zongyoujifeng.day10.holding;


import typeinfo.pets.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ListFeatures
 * @description List
 * @date 2021/2/25 13:01
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1:" + pets);

        Hamster h = new Hamster();
        pets.add(h);
        print("2:" + pets);

        print("3:" + pets.contains(h));

        pets.remove(h);

        Pet p = pets.get(2);
        print("4:" + p + " " + pets.indexOf(p));

        Pet cymric = new Cymric();
        print("5:" + pets.indexOf(cymric));
        print("6:" + pets.contains(cymric));
        //Must be the exact object
        print("7:" + pets.remove(p));
        print("8:" + pets);
        pets.add(3, new Mouse());
        print("9:" + pets);

        List<Pet> sub = pets.subList(1, 4);
        print("subList" + sub);
        print("10:" + pets.containsAll(sub));
        Collections.sort(sub);
        print("sorted subList: " + sub);

    }
}
