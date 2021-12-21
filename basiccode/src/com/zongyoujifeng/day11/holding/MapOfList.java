package com.zongyoujifeng.day11.holding;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MapOfList
 * @description 跟踪有很多宠物的人
 * @date 2021/2/26 19:55
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"),
                new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
                new Cat("Stanford aka Stinky el Negro"), new Cat("Pinkola")));
        petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Issac"), Arrays.asList(new Rat("Freckly")));

    }

    public static void main(String[] args) {
        // ketSet()方法产生了由在petPeople中所有键组成的Set
        print("People: " + petPeople.keySet());
        // petPeople中所有值组成的集合
        print("Pets" + petPeople.values());
        for (Person person : petPeople.keySet()) {
            print(person + " has:");
            for (Pet pet :
                    petPeople.get(person)) {
                print("  " + pet);
            }
        }
    }
}
