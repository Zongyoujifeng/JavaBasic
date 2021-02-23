package com.zongyoujifeng.day09.innnerclass;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BigEgg
 * @description 内部类是否能被覆盖
 * @date 2021/2/23 9:17
 */
public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            print("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}

class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            print("Egg.Yolk()");
        }
    }

    public Egg() {
        print("New Egg()");
        y = new Yolk();
    }
}