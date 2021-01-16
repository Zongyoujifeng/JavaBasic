package com.zongyoujifeng.day03.resusing;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SpaceShip
 * @description 代理
 * @date 2021/1/16 13:16
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
