package com.zongyoujifeng.day13.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName UnboundedWildcards1
 * @description 无界通配符 原生类型 <?>
 * @date 2021/3/7 9:45
 */
public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign(List list) {
        list1 = list;
        list2 = list;
        //warning:unchecked conversion
        // list3 = list;
    }

    static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());

        assign(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());

        List<?> wildList = new ArrayList<>();
        wildList = new ArrayList<String>();

        assign(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
