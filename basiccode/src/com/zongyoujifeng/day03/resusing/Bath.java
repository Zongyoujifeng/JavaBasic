package com.zongyoujifeng.day03.resusing;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Bath
 * @description 初始化对象的引用
 * @date 2021/1/15 18:28
 */
public class Bath {
    /**
     * initializing at point of definition
     */
    private String s1 = "Happy",
            s2 = "Happy",
            s3, s4;

    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        print("Inside Bath()");
        s3 = "joy";
        toy = 3.14f;
        castille = new Soap();
    }
    //Instance initialization
    {
        i = 47;
    }

    @Override
    public String toString() {
        return "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}


class Soap {
    private String s;

    @Override
    public String toString() {
        return s;
    }

    Soap() {
        print("Soap()");
        s = "Constructed";
    }
}