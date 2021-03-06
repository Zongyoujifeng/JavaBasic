package com.zongyoujifeng.day13.generic;

import java.awt.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName InheritBounds
 * @description 如何在继承的每个层次上添加边界限制
 * @date 2021/3/6 16:34
 */
public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        solid2.color();
        solid2.getX();
        solid2.weight();
    }
}

class HoldItem<T> {
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Colored2<T extends HasColor> extends HoldItem<T> {
    public Colored2(T item) {
        super(item);
    }
    java.awt.Color color() {
        return item.getColor();
    }
}

class ColorDimension2<T extends Dimension & HasColor>
extends Colored2<T> {
    public ColorDimension2(T item) {
        super(item);
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

class Solid2<T extends Dimension & HasColor & Weight>
extends ColorDimension2<T> {
    public Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }
}