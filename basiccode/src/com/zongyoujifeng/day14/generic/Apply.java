package com.zongyoujifeng.day14.generic;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Apply
 * @description 反射将所有类型检查转移到了运行时，如何实现编译期类型检查
 * @date 2021/5/3 9:45
 */
public class Apply {
    public static <T, S extends Iterable<? extends T>>
    void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq) {
                f.invoke(t, args);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public void rotate() {
        print(this + "rotate");
    }

    public void resize(int newSize) {
        print(this + "resize " + newSize);
    }
}

class Square extends Shape {
}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++) {
                add(type.getDeclaredConstructor().newInstance());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<>();
        int times  = 10;
        for (int i = 0; i < times; i++) {
            shapes.add(new Shape());
        }
        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes,
                Shape.class.getMethod("resize", int.class), 5);

        List<Square> squares = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            squares.add(new Square());
        }
        Apply.apply(squares, Square.class.getMethod("rotate"));
        Apply.apply(squares, Square.class.getMethod("resize", int.class), 5);
        Apply.apply(new FilledList<>(Shape.class, 10),
                Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<>(Square.class, 10),
                Shape.class.getMethod("rotate"));
        SimpleQueue<Shape> shapeQ = new SimpleQueue<>();
        int time = 5;
        for (int i = 0; i < time; i++) {
            shapeQ.add(new Shape());
            shapeQ.add(new Square());
        }
        Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
    }
}
