package com.zongyoujifeng.day13.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ArrayOfGeneric
 * @description 泛型数组
 * @date 2021/3/6 15:44
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //Compiles;produces ClassCastException
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<>();
    }
}
