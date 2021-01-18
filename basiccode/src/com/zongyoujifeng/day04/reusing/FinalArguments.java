package com.zongyoujifeng.day04.reusing;

/**
 * @author 10451
 * @version 1.0
 * @ClassName FinalArguments
 * @description final参数
 * @date 2021/1/18 12:43
 */
public class FinalArguments {
    void with(final Gizmo g) {
        // g = new Gizmo();//Illegal -- g is final
    }
    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    //You can only read from a final primitive

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

class Gizmo {
    public void spin() {
    }

}
