package com.zongyoujifeng.day16.containers;

public class Groundhog {
    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}
