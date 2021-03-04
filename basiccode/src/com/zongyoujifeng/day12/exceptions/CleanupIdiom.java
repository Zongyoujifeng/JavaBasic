package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName CleanupIdiom
 * @description 创建需要清理的对象之后，立即进入try-finally语句块
 * @date 2021/3/4 12:31
 */
public class CleanupIdiom {

    public static void main(String[] args) {
        //Section 1:
        NeedsCleanup nc1 = new NeedsCleanup();

        try {

        } finally {
            nc1.dispose();
        }

        //Section 2:
        //If construction cannot fail you can group objects

        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        //Section3
        //If construction can fail you must guard each one:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {

                }finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }

}

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
    //Construction can fail

    public NeedsCleanup2() throws ConstructionException {
    }
}


