package com.zongyoujifeng.day11.holding;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName PetMap
 * @description 使用String描述来查找Pet
 * @date 2021/2/26 19:46
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));

        print(petMap);

        print(petMap.get("My Cat"));
        Pet my_dog = petMap.get("My Dog");
        print(my_dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(my_dog));
    }
}
