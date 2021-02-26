package com.zongyoujifeng.day11.holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 10451
 * @version 1.0
 * @ClassName UniqueWordsAlphabetic
 * @description 按照字母序排序,不区分大小写字母
 * @date 2021/2/26 17:58
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("basiccode/src/com/zongyoujifeng/day11/holding/UniqueWordsAlphabetic.java","\\W+"));
        System.out.println(words);
    }
}
