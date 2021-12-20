package com.zongyoujifeng.day10.holding;


import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ListFeatures
 * @description List
 * @date 2021/2/25 13:01
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1:随机生成7个Pet对象列表：" + pets);

        Hamster h = new Hamster();

        pets.add(h);
        print("2:添加Hamster后列表为:" + pets);

        print("3:列表List是否包含Hamster: " + pets.contains(h));

        pets.remove(h);

        Pet p = pets.get(2);
        print("4:第二个参数" + p + "的下标是" + pets.indexOf(p));

        Pet cymric = new Cymric();
        print("5:重新创建一个Cymric对象，传递给indexOf()方法" + pets.indexOf(cymric));
        print("6:判断List中是否包含:" + pets.contains(cymric));
        //Must be the exact object
        print("7:删除指定元素" + pets.remove(p));
        print("8:删除指定元素后列表为:" + pets);
        pets.add(3, new Mouse());
        print("9:指定位置添加新创建的Mouse对象之后的List:" + pets);

        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10:是否包含子列表" + pets.containsAll(sub));
        Collections.sort(sub);
        print("sorted subList: " + sub);

        print("11:子表排序后List是否包含子表" + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        print("shuffled subList: " + sub);
        print("12:随机打乱子表后List是否包含子表" + pets.containsAll(sub));

        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));

        print(sub);
        copy.retainAll(sub);
        print("13: 求交集: " + copy);
        copy = new ArrayList<>(pets);
        copy.remove(2);
        print("14: " + copy);
        copy.removeAll(sub);
        print("15:" + copy);
        copy.set(1, new Mouse());

        print("16:" + copy);
        copy.addAll(2, sub);
        print("17:" + copy);

        print("18:" + pets.isEmpty());
        pets.clear();
        print("19:" + pets);
        print("20：" + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21:" + pets);
        Object[] o = pets.toArray();
        print("22:" + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23:" + pa[3].id());
    }
}
