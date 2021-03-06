package net.mindview.util;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ThreeTuple
 * @description 三元组
 * @date 2021/3/4 15:58
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
