package net.mindview.util;

import java.util.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName New
 * @description 工具类：包含个各种各样的static方法，
 * 专门用来创建各种常用的容器对象
 * @date 2021/3/5 18:13
 */
public class New {

    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<>();
    }

    public static <T> Set<T> set() {
        return new HashSet<>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();

        List<String> ls = New.list();

        LinkedList<String> lls = New.lList();

        Set<String> ss = New.set();

        Queue<String> qs = New.queue();
    }
}
