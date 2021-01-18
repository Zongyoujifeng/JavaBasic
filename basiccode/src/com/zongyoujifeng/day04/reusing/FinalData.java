package com.zongyoujifeng.day04.reusing;

import java.util.Random;

/**
 * @author 10451
 * @version 1.0
 * @ClassName FinalData
 * @description final关键字
 * @date 2021/1/18 12:07
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    //Typical public constant

    public static final int VALUE_THREE = 39;

    //Cannot be compile-time constant

    private final int i4 = rand.nextInt(20);

    static final int INT_5 = rand.nextInt(20);

    private Value v1 = new Value(11);

    private final Value v2 = new Value(22);

    private static final Value VAL_3 = new Value(33);

    //Arrays

    private final int[] a = {1, 2, 3, 4, 5, 6};


    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", i4=" + i4 + ",INT_5" + INT_5 +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //fd1.valueOne++;//Error:can't change value
        fd1.v2.i++;

    }
}

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}
