package com.zongyoujifeng.day01.operators;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName MathOps
 * @description 算数操作符
 * @date 2021/1/13 18:58
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        //100为上限 范围：1~100
        j = rand.nextInt(100) + 1;
        print("j:" + j);
        k = rand.nextInt(100) + 1;
        print("k:" + k);
        i = j + k;
        print("j + k:" + i);
        i = j - k;
        print("j - k:" + i);
        i = j / k;
        print("j / k:" + i);
        i = j * k;
        print("j * k:" + i);
        i = j % k;
        print("j % k:" + i);
        j %= k;
        print("j %= k:" + j);
        //Floating-point number tests:
        float u, v, w;
        v = rand.nextFloat();
        print("v:" + v);
        w = rand.nextFloat();
        print("w:" + w);
        u = v + w;
        print("v + w:" + u);
        u = v - w;
        print("v - w:" + u);
        u = v * w;
        print("v * w:" + u);
        u = v / w;
        print("v / w:" + u);
        u += v;
        print("u += v:" + u);
        u -= v;
        print("u -= v:" + u);
        u *= v;
        print("u *= v:" + u);
        u /= v;
        print("u /= v:" + u);
    }
}
