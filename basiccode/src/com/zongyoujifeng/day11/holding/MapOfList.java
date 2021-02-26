package com.zongyoujifeng.day11.holding;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree")));
    }
}
