package com.zongyoujifeng.day11.holding;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName LinkedListFeatures
 * @description LinkedList
 * @date 2021/2/26 10:05
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);
        //getFirst()和element()完全一样,返回列表的第一个元素但是不删除，
        // 如果List为空，则抛出NoSuchElementException
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
        //检索但不删除第一个元素，在列表为空时返回Null
        print("pets.peek(): " + pets.peek());
        //remove()和removeFirst()完全一样，删除第一个元素并返回，
        // 如果列表为空，则抛出NoSuchElementException
        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
        //移除并返回非空的第一个元素在列表为空时返回Null
        print("pets.poll(): " + pets.poll());
        print(pets);


        //将指定的元素插入此列表的开头
        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);

        //offer()和add()完全一样，将指定的元素追加到此列表的末尾
        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);
        pets.add(Pets.randomPet());
        print("After add(): " + pets);
        //将指定的元素追加到此列表的末尾
        pets.addLast(new Hamster());
        print("After addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());
    }
}
