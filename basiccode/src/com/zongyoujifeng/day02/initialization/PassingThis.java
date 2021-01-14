package com.zongyoujifeng.day02.initialization;

/**
 * @author 10451
 * @version 1.0
 * @ClassName PassingThis
 * @description 将当前对象传递给其他方法 Apple类需要调用Peeler.peel()方法，它是一个外部工具方法，为了将自身传递给外部方法，必须使用this关键字
 * @date 2021/1/14 16:37
 */
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple){
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}