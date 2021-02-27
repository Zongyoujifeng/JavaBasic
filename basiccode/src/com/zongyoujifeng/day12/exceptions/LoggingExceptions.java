package com.zongyoujifeng.day12.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Target;
import java.util.logging.Logger;

/**
 * @author 10451
 * @version 1.0
 * @ClassName LoggingExceptions
 * @description 使用java.util.logging工具将输出记录到日志中，
 * @date 2021/2/27 12:17
 */
public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }

    }
}

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
