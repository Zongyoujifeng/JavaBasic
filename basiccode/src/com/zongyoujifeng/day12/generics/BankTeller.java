package com.zongyoujifeng.day12.generics;

import net.mindview.util.Generator;

import java.util.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BankTeller
 * @description A very simple bank teller simulation
 * @date 2021/3/5 21:36
 */
public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);

        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 4);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator, 4);
        for (Customer c: line) {
            serve(tellers.get(rand.nextInt(tellers.size())), c);
        }

    }
}

class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }


    /**
     * A method to produce Generator objects
     *
     * @return Generator
     */
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long counter = 1;
    private static long id = counter++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    /**
     * A single Generator object
     */
    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };

}
