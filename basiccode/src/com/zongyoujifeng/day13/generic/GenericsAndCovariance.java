package com.zongyoujifeng.day13.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GenericsAndCovariance
 * @description 两个类型之间建立某种类型的向上转型关系
 * @date 2021/3/6 17:40
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        //Wildcard allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        //Compile Error: can't add any type of object
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());

        //Legal but uninteresting
        flist.add(null);
        //We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
}
