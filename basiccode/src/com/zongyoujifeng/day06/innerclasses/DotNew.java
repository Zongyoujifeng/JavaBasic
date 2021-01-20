package com.zongyoujifeng.day06.innerclasses;

/**
 * @author 10451
 * @version 1.0
 * @ClassName DotNew
 * @description
 * @date 2021/1/20 11:46
 */
public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
