package com.zongyoujifeng.day11.holding;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {
        // System.getenv()返回一个Map，entrySet()产生一个由Map.entry的元素构成的Set
        // 操作系统环境变量
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
