package com.zongyoujifeng.day06.interfaces;

import java.net.ServerSocket;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Factories
 * @description 工厂
 * @date 2021/1/20 9:34
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        //如果不是工厂方法需要指定Service的确切类型，以便调用合适的构造器
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}

interface Service {
    /**
     * 方法1
     */
    void method1();

    /**
     * 方法2
     */
    void method2();
}

interface ServiceFactory {
    /**
     * 获取方法
     *
     * @return
     */
    Service getService();
}

class Implementation1 implements Service {
    public Implementation1() {
    }

    @Override
    public void method1() {
        print("Implementation1 method1");
    }

    @Override
    public void method2() {
        print("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {
    public Implementation2() {
    }

    @Override
    public void method1() {
        print("Implementation2 method1");
    }

    @Override
    public void method2() {
        print("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
