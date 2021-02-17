package com.zongyoujifeng.day08.innerclass;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Factories
 * @description 再坊工厂方法 Implementation1和Implementation2的构造器都可以是private
 * @date 2021/2/16 22:39
 */
public class Factories {
    public static void ServiceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        ServiceConsumer(Implementation1.factory);
        //Implementations are completely interchangable
        ServiceConsumer(Implementation2.factory);
    }
}

interface Service {
    /**
     * 接口方法1
     */
    void method1();

    /**
     * 接口方法2
     */
    void method2();
}

interface ServiceFactory {
    /**
     * 获取服务
     *
     * @return 服务类型
     */
    Service getService();
}

class Implementation1 implements Service {
    private Implementation1() {

    }

    @Override
    public void method1() {
        print("Implementation1 method1");
    }


    @Override
    public void method2() {
        print("Implementation1 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };

}

class Implementation2 implements Service {
    private Implementation2() {
    }

    @Override
    public void method1() {
        print("Implementation2 method1");
    }

    @Override
    public void method2() {
        print("Implementation2 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

