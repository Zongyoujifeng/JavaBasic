package com.zongyoujifeng.day08.innerclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Test
 * @description 使用嵌套类测试
 * @date 2021/2/17 16:01
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
