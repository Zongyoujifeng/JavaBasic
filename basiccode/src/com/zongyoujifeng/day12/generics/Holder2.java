package com.zongyoujifeng.day12.generics;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Holder2
 * @description 直接持有Object类型对象
 * @date 2021/3/4 15:35
 */
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());

        Automobile a2 = (Automobile) h2.getA();
        System.out.println(a2);
        System.out.println("==============================================");
        h2.setA("Not an Automobile");

        String s = (String) h2.getA();
        System.out.println(s);
        System.out.println("==============================================");
        h2.setA(1);
        Integer x = (Integer) h2.getA();
        System.out.println(x);
    }
}
