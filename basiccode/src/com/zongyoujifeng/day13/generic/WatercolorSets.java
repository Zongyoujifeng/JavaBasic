package com.zongyoujifeng.day13.generic;

import com.zongyoujifeng.day13.generic.watercolors.Watercolors;

import java.util.EnumSet;
import java.util.Set;

import static com.zongyoujifeng.day13.generic.watercolors.Watercolors.*;
import static net.mindview.util.Print.print;
import static net.mindview.util.Sets.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName WatercolorSets
 * @description 测试EnumSet
 * @date 2021/3/6 9:35
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);

        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);

        print("set1: " + set1);
        System.out.println("===============================================================");
        print("set2: " + set2);

        print("union(set1, set2):\n " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        print("intersection(set1, set2):\n" + subset);
        print("difference(set1, subset):\n" + difference(set1, subset));
        print("difference(set2, subset):\n" + difference(set2, subset));
        print("complement(set1, set2): \n" + complement(set1, set2));
    }
}
