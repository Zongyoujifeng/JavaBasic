package com.zongyoujifeng.day11.holding;

import typeinfo.pets.*;

import java.util.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName InterfaceVsIterator
 * @description 接口和迭代器
 * @date 2021/2/26 23:52
 */
public class InterfaceVsIterator {
    // 接收迭代器
    public static void display(Iterator<Pet> it) {
        // 迭代每一个元素
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ": " + p + " ");
        }
        System.out.println();
    }

    // 接收集合
    public static void display(Collection<Pet> pets) {
        for (Pet p : pets) {
            System.out.print(p.id() + ": " + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(8);
        System.out.println(petList);
        Set<Pet> petSet = new HashSet<>(petList);
        System.out.println(petSet);
        // System.out.println();

        // List<Pet> newList = new ArrayList();
        //
        // newList.add(new Rat());
        // newList.add(new Manx());
        // newList.add(new Cymric());
        // newList.add(new Mutt());
        // newList.add(new Pug());
        // newList.add(new Cymric());
        // newList.add(new Pug());
        // newList.add(new Manx());


        // for (Pet pet : newList) {
        //     System.out.print(pet + " ");
        // }

        // Set<Pet> newPetSet = new HashSet<>(newList);
        // Map<String, Pet> petMap = new LinkedHashMap<>();
        // String[] names = ("Ralph, Eric, Robin, Lacey, " +
        //         "Britney, Sam, Spot, Fluffy").split(", ");
        // for (int i = 0; i < names.length; i++) {
        //     petMap.put(names[i], petList.get(i));
        // }
        // for (Pet pet : newPetSet) {
        //     System.out.print(pet + " ");
        // }
        display(petList);
        display(petSet);

        // display(petList.iterator());
        // display(petSet.iterator());

        // System.out.println(petMap);
        // System.out.println(petMap.keySet());
        // display(petMap.values());
        // display(petMap.values().iterator());
    }
}
