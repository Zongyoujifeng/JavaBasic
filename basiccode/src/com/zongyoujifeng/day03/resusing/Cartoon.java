package com.zongyoujifeng.day03.resusing;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Cartoon
 * @description 基类子对象的正确初始化
 * @date 2021/1/16 10:23
 */
public class Cartoon extends Drawing{
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

