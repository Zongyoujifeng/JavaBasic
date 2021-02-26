package com.zongyoujifeng.day11.holding;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author 10451
 * @version 1.0
 * @ClassName PriorityQueueDemo
 * @description 先进先出队列
 * @date 2021/2/26 21:36
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }

        QueueDemo.printQ(priorityQueue);
    }
}
