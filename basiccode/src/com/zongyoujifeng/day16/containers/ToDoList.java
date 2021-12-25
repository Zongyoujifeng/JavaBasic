package com.zongyoujifeng.day16.containers;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String item, char primary, int secondary) {
            this.item = item;
            this.primary = primary;
            this.secondary = secondary;
        }

        @Override
        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary) {
                return +1;
            }
            if (primary == arg.primary) {
                if (secondary > arg.primary) {
                    return +1;
                } else if (secondary == arg.primary) {
                    return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) + secondary + ": " + item;
        }
    }

    public boolean add(String td, char pri, int sec) {
        return super.add(new ToDoItem(td, pri, sec));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash", 'C', 4);
        toDoList.add("Feed dog", 'A', 2);
        toDoList.add("Feed bird", 'B', 7);
        toDoList.add("Mow lawn", 'C', 3);
        toDoList.add("Water lawn", 'A', 1);
        toDoList.add("Feed Cat", 'B', 1);
        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }
    }
}
