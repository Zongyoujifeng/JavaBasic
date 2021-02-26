package com.zongyoujifeng.day11.holding;

import net.mindview.util.Stack;

/**
 * @author 10451
 * @version 1.0
 * @ClassName StackTest
 * @description 栈弹出和压入
 * @date 2021/2/26 11:03
 */
public class StackTest {
    public static void main(String[] args) {
        String str = "My Dog has fleas";
        String reg = " ";
        Stack<String> stack = new Stack<>();
        for (String s : str.split(reg)) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
