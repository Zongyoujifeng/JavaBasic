package com.zongyoujifeng.day13.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GenericArray
 * @description 泛型数组包装器
 * @date 2021/3/6 15:57
 */
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }


    /**
     * Method that exposes the underlying representation
     *
     * @return T[]
     */
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);

        Object[] oa = gai.rep();
    }
}
