package com.zongyoujifeng.day13.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Holder
 * @description Holder
 * @date 2021/3/6 18:01
 */
public class Holder<T> {

    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<>(new Apple());
        Apple d = Apple.getValue();
        Apple.setValue(d);

        // Holder<Fruit> Fruit = Apple;

        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.getValue();

        d = (Apple) fruit.getValue();

        try {
            Orange c = (Orange) fruit.getValue();
        } catch (Exception e) {
            System.out.println(fruit.equals(d));
        }

    }
}
