package com.zongyoujifeng.day08.innerclass;

/**
 * @author 10451
 * @version 1.0
 * @ClassName ClassInterface
 * @description 接口内部的类
 * @date 2021/2/17 14:33
 */
public interface ClassInterface {
    /**
     * 抽象方法
     */
    void howdy();
    class Test implements ClassInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
