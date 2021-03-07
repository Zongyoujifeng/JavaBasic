package com.zongyoujifeng.day14.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Fill
 * @description
 * @date 2021/5/3 11:00
 */
public class Fill {
    public static <T> void fill(Collection<T> collection,
                                Class<? extends T> classToken, int size) {
        try {
            for (int i = 0; i < size; i++) {
                collection.add(classToken.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Contract {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getName() + " " + id;
    }
}

class TitleTransfer extends Contract {
}

class FillTest {
    public static void main(String[] args) {
        List<Contract> contracts = new ArrayList<>();
        Fill.fill(contracts, Contract.class, 3);
        Fill.fill(contracts, TitleTransfer.class, 2);
        for (Contract c : contracts) {
            System.out.println(c);
        }
        SimpleQueue<Contract> contractQueue = new SimpleQueue<>();
        //Won't work
        // Fill.fill(contractQueue, Contract.class, 3);
    }
}