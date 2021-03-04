package com.zongyoujifeng.day12.exceptions;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Cleanup
 * @description
 * @date 2021/3/4 10:27
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            // InputFile in = new InputFile("E:\\IdeaProjectsNew\\JavaBasic\\basiccode\\src\\com" + "\\zongyoujifeng\\day11\\holding\\SetOperation.java");
            InputFile in = new InputFile("..\\JavaBasic\\basiccode\\src\\com" + "\\zongyoujifeng\\day11\\holding" +
                    "\\SetOperation.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) ;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Caught Exception in main");
            e.printStackTrace(System.out);
        }
    }
}
