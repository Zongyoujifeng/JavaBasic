package com.zongyoujifeng.day16.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(
                Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("word"));
        System.out.println(list);
    }
}

class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}