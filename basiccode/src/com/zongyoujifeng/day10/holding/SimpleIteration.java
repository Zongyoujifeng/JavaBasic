package com.zongyoujifeng.day10.holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SimpleIteration
 * @description 迭代器 是一个对象，它的工作是遍历并选择序列中的对象，而程序员不必关心该序列的底层结构
 * 迭代器通常被称为轻量级对象，创建它的代价很小。
 * @date 2021/2/25 15:19
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        for (Pet p: pets) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
