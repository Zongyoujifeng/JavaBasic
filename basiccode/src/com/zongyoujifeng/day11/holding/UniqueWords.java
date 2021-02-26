package com.zongyoujifeng.day11.holding;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 10451
 * @version 1.0
 * @ClassName UniqueWords
 * @description 使用工具类将文件中的单词列出
 * @date 2021/2/26 17:25
 */
public class UniqueWords {
    public static void main(String[] args) {
        // Set<String> words = new TreeSet<>(new TextFile("E:\\IdeaProjectsNew\\JavaBasic\\basiccode\\src\\com" + "\\zongyoujifeng\\day11\\holding\\SetOperation.java", "\\W+"));
        Set<String> words = new TreeSet<>(new TextFile(("basiccode\\src\\com\\zongyoujifeng\\day11\\holding" +
                "\\SetOperation.java"), "\\W+"));
        System.out.println(new File("basiccode\\src\\com\\zongyoujifeng\\day11\\holding\\SetOperation.java").getAbsolutePath());

        System.out.println(words);

    }
}
