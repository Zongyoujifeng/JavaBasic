package com.zongyoujifeng.day12.generics;

import com.zongyoujifeng.day12.generics.coffee.Coffee;
import com.zongyoujifeng.day12.generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Generators
 * @description 利用生成器，方便填充Collection
 * @date 2021/3/5 21:50
 */
public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
          new ArrayList<>(), new CoffeeGenerator(), 4);

        for (Coffee c: coffee) {
            System.out.println(c);
        }
    }

}
