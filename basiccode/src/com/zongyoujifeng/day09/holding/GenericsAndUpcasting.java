package com.zongyoujifeng.day09.holding;

import java.util.ArrayList;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GenericsAndUpcasting
 * @description 泛型
 * @date 2021/2/23 14:06
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
    }
}

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}
