package com.zongyoujifeng.template;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 10451
 * @version 1.0
 * @ClassName TestTemplate
 * @description 代码模板
 * @date 2021/10/2 16:38
 */
public class TestTemplate {
    //prsf private static final
    private static final int age = 10;
    //psf
    // public static final



    public static void main(String[] args) {
        System.out.println();
        int i = 10;
        //soutv 打印最近的变量
        System.out.println("i = " + i);
        //soutp 打印方法的形参
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm 打印方法的名称
        System.out.println("TestTemplate.main");

    }

    //循环
    public void a() {
        for (int j = 0; j < 10; j++) {

        }

        int[] arr = {1,2,3,4,6};
        //arr.fori
        for (int i = 0; i < arr.length; i++) {

        }
        //.forr逆向
        for (int i = arr.length - 1; i >= 0; i--) {

        }
        //增强for循环
        for (int i : arr) {

        }

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (String s : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
    }

    //判断
    public void b() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //ifn 或者.null
        if (list == null) {

        }
        //inn 或者.nn
        if (list != null) {

        }



    }
}
