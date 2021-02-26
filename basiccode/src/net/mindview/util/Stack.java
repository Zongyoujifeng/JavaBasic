//: net/mindview/util/Stack.java
// Making a stack from a LinkedList.
package net.mindview.util;

import java.util.LinkedList;

/**
 * 栈
 * @author Bruce Eckel
 * @param <T>
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
} ///:~
