package com.zongyoujifeng.day01.InputTest;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello," + name + "!Next year, you'll be " + (age + 1));

    }
}
