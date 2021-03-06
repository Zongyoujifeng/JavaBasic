package com.zongyoujifeng.day13.generic;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BasicBounds
 * @description 边界的基本要素
 * @date 2021/3/6 16:08
 */
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}

interface HasColor {
    /**
     * 获取颜色
     *
     * @return 颜色
     */
    java.awt.Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    ColoredDimension(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
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

interface Weight {
    /**
     * weight
     *
     * @return int
     */
    int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
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

    int weight() {
        return item.weight();
    }
}

class Bounded extends Dimension implements HasColor, Weight {
    @Override
    public java.awt.Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}