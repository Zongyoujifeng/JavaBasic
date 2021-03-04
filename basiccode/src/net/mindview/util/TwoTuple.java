package net.mindview.util;

/**
 * @author 10451
 * @version 1.0
 * @ClassName TwoTuple
 * @description 2维元组
 * @date 2021/3/4 15:46
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "( " + first + ", " + second + " )";
    }
}
