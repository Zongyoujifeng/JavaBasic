package net.mindview.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Sets
 * @description Set泛型方法
 * @date 2021/3/6 8:44
 */
public class Sets {

    /**
     * 求并集
     *
     * @param a   集合A
     * @param b   集合B
     * @param <T> 集合类型
     * @return 并集
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    /**
     * 求交集
     *
     * @param a   集合A
     * @param b   集合B
     * @param <T> 集合类型
     * @return 交集
     */
    public static <T>
    Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    /**
     * Subtract subset from superset:
     * 差集
     *
     * @param superset 父集
     * @param subset   子集
     * @param <T>      集合类型
     * @return 删除子集后的结果
     */
    public static <T>
    Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    /**
     * 删除交集外的所有元素
     * @param a 集合A
     * @param b 集合B
     * @param <T> 集合类型
     * @return 除交集外的所有元素
     */
    public static <T>
    Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }

}
