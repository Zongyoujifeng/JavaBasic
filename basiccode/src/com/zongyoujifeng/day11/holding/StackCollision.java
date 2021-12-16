package com.zongyoujifeng.day11.holding;

import net.mindview.util.Stack;

public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }

        while (! stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        Stack<String> stack2 = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack2.push(s);
        }
        while (! stack2.empty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
