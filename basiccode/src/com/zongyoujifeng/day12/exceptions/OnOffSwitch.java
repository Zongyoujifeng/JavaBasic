package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName OnOffSwitch
 * @description Why use finally?
 * @date 2021/2/27 19:49
 */
public class OnOffSwitch {
    private static Switch s = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            s.on();
            //Code that can throw Exception
            f();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
            s.off();
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
            s.off();
        }
    }

}
