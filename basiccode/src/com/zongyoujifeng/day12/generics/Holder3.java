package com.zongyoujifeng.day12.generics;

import typeinfo.pets.Pet;
import typeinfo.pets.Rat;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Holder3
 * @description 暂时不指定类型
 * @date 2021/3/4 15:41
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.getA();

        System.out.println(a);

        Holder3<Pet> h4 = new Holder3<>(new Rat());
        Pet a1 = h4.getA();
        long id = a1.id();
        System.out.println(a1 + ": " + id);
    }
}
