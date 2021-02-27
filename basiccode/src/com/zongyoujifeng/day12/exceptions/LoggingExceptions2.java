package com.zongyoujifeng.day12.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Target;
import java.util.logging.Logger;

/**
 * @author 10451
 * @version 1.0
 * @ClassName LoggingExceptions2
 * @description Loging caught exceptions
 * @date 2021/2/27 12:24
 */
public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
