package com.zongyoujifeng.day13.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName CaptureConversion
 * @description 捕获转换
 * @date 2021/3/7 14:19
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T value = holder.getValue();
        System.out.println(value.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<>(1);
        //Unchecked assignment
        f1(raw);
        f2(raw);

        Holder rawBasic = new Holder();
        rawBasic.setValue(new Object());
        f2(rawBasic);

        Holder<?> wildcarded = new Holder<>(1.0);
        f2(wildcarded);
    }
}
