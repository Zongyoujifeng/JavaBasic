package com.zongyoujifeng.day12.generics;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SimplerPets
 * @description 类型参数推断
 * @date 2021/3/5 19:44
 */
public class SimplerPets {
    public static void main(String[] args) {

        Map<Person, List<? extends Pet>> petPeople = New.map();


    }
}
