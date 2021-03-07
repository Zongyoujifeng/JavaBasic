package com.zongyoujifeng.day13.generic;

import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SuperTypeWildcards
 * @description 超类型通配符
 * @date 2021/3/7 9:13
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());

        //下界是Apple
        // apples.add(new Fruit());
    }
}
