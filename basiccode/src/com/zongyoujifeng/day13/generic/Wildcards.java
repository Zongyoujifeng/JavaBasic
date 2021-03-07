package com.zongyoujifeng.day13.generic;

import java.util.HashMap;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Wildcards
 * @description 原生类型 无界通配
 * @date 2021/3/7 13:21
 */
public class Wildcards {

    static void rawArgs(Holder holder, Object arg) {
        //Warning:Unchecked call to setValue(T) as a member of the raw type Holder
        // holder.setValue(arg);
        //Same warning
        // holder.setValue(new Wildcards());

        //Can't do this,don't have any T
        // T t = holder.getValue();
    }

    static void unboundedArg(Holder<?> holder, Object arg) {
        //Error:原生Holder将持有任何类型的组合，
        // 而Holder<?>将持有具有某种具体类型的同构集合
        // holder.setValue(arg);

        // T t = holder.getValue();

        Object obj = holder.getValue();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.getValue();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T args) {
        holder.setValue(args);
        T t = holder.getValue();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
        //Holder在类型上的限制被放松为包括持有任何扩展自T的对象的Holder
        //如果T是Fruit，那么holder可以是Hold<Apple>
        //为了防止将Orange放入Holder<Apple>中，
        // 对set()的调用(或者对任何接受这个类型参数为参数的对象的方法的调用)都是不允许的
        //Error:
        // holder.setValue(arg);
        T t = holder.getValue();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        //holder可以是持有任何T的基类型的容器。
        // 因此，set()可以接受T，
        // 因为任何可以工作于基类的对象都可以多态地作用于导出类T
        holder.setValue(arg);
        //Error:Incompatible types
        // T t = holder.getValue();

        //Ok, but type information has been lost
        Object obj = holder.getValue();

        //尝试着调用get()是没有用的，因为由holder持有的类型可以是任何超类型，
        // 因此唯一安全的类型是Object
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();

        raw = new Holder();

        Holder<Long> qualified = new Holder<>();

        Holder<?> unbounded = new Holder<>();

        Holder<? extends Long> bounded = new Holder<>();

        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        unboundedArg(raw, lng);
        unboundedArg(qualified, lng);
        unboundedArg(unbounded, lng);
        unboundedArg(bounded, lng);

        Object r2 = exact1(qualified);
        Object r3 = exact1(unbounded);
        Long r4 = exact1(bounded);

    }
}
