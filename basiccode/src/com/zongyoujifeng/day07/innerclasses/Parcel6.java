package com.zongyoujifeng.day07.innerclasses;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Parcel6
 * @description 在任意作用域内嵌入一个内部类
 * @date 2021/1/22 17:17
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                public String getSlip() {
                    return id;
                }
                TrackingSlip ts = new TrackingSlip("x");
                String s = ts.getSlip();
            }

        }
    }
    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
