package com.zongyoujifeng.day09.innnerclass;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName BigEgg2
 * @description 内部类的覆盖
 * @date 2021/2/23 9:26
 */
public class BigEgg2 extends Egg2{
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            print("BigEgg2.Yolk()");
        }

        @Override
        public void f() {
            print("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}

class Egg2 {
    protected class Yolk {
        public Yolk() {
            print("Egg2.Yolk()");
        }

        public void f() {
            print("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();

    public Egg2() {
        print("New Egg2()");
    }
    public void insertYolk(Yolk yy) {
        y = yy;
    }
    public void g() {
        y.f();
    }
}
