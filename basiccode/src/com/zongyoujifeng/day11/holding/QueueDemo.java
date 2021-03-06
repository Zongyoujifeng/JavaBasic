package com.zongyoujifeng.day11.holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author 10451
 * @version 1.0
 * @ClassName QueueDemo
 * @description Queue Upcasting to a Queue from a LinkedList
 * @date 2021/2/26 21:28
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
