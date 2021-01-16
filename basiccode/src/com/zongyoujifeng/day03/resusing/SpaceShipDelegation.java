package com.zongyoujifeng.day03.resusing;

/**
 * @author 10451
 * @version 1.0
 * @ClassName SpaceShipDelegation
 * @description 使用代理
 * @date 2021/1/16 13:23
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    //Delegated methods:

    void up(int velocity) {
        controls.up(velocity);
    }

    void down(int velocity) {
        controls.down(velocity);
    }

    void left(int velocity) {
        controls.left(velocity);
    }

    void right(int velocity) {
        controls.right(velocity);
    }

    void forward(int velocity) {
        controls.forward(velocity);
    }

    void back(int velocity) {
        controls.back(velocity);
    }

    void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }

}
