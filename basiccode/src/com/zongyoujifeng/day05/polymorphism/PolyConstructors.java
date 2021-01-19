package com.zongyoujifeng.day05.polymorphism;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName PolyConstructors
 * @description
 * @date 2021/1/19 10:49
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    public Glyph() {
        print("Glyph() before draw()");
        //此处的draw()方法在RoundGlyph中被覆盖了
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}
