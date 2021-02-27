package com.zongyoujifeng.day12.exceptions;

import static com.zongyoujifeng.day12.exceptions.OnOffSwitch.f;

/**
 * @author 10451
 * @version 1.0
 * @ClassName WithFinally
 * @description Finally Guarantees cleanup
 * @date 2021/2/27 20:00
 */
public class WithFinally {
    static Switch s = new Switch();

    public static void main(String[] args) {
        try {
            s.on();
            f();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
        } finally {
            s.off();
        }
    }
}
