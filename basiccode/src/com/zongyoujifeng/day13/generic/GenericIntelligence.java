package com.zongyoujifeng.day13.generic;

import java.util.Arrays;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GenericIntelligence
 * @descriptionn contains() 和indexOf()的调用都接收Apple对象作为参数
 * @date 2021/3/6 17:53
 */
public class GenericIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }


}
