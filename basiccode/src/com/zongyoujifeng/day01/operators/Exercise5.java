package com.zongyoujifeng.day01.operators;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Exercise5
 * @description 练习
 * @date 2021/1/13 20:01
 */
public class Exercise5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "Ruff!";

        dog2.name = "sruffy!";
        dog2.says = "Wurf!";
        System.out.println("dog1.name:" + dog1.name + ",dog1.says:" + dog1.says);
        System.out.println("dog2.name:" + dog2.name + ",dog2.says:" + dog2.says);
        Dog dog3 = new Dog();
        dog3 = dog1;
        //==比较的是对象的引用
        System.out.println(dog1 == dog3);
        //equals比较的也是对象的引用
        System.out.println(dog1.equals(dog3));
    }
}

class Dog{
    String name;
    String says;
}
