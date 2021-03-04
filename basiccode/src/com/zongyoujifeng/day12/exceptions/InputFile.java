package com.zongyoujifeng.day12.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 10451
 * @version 1.0
 * @ClassName InputFile
 * @description 构造器
 * @date 2021/3/4 10:01
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            //Other code that might throws exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            //Wasn't open, so don't close it
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException ioException) {
                System.out.println("in.close unsuccessful");
            }
            throw e;
        } finally {
            //Don't close it here
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
