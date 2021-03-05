package com.zongyoujifeng.day12.strings;

import net.mindview.util.Print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName TestRegularExpression
 * @description 测试正则表达式 命令行参数是正则表达式
 * 能否匹配一个输入字符串
 * @date 2021/3/5 14:36
 */
public class TestRegularExpression {
    public static void main(String[] args) {

        if (args.length < 2) {
            print("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }

        print("Input: \"" + args[0] + "\"");

        for (String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
