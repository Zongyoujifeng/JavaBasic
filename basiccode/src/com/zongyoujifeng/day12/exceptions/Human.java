package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Human
 * @description 异常匹配
 * @date 2021/3/4 12:51
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}
