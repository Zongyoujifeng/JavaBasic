package com.zongyoujifeng.day10.holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ListIteration
 * @description ListIterator
 * @date 2021/2/25 17:07
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "," + it.nextIndex() + ". " + it.previousIndex() + ";");
        }
        System.out.println();

        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
