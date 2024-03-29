package com.zongyoujifeng.day16.containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;

import static net.mindview.util.Print.print;

public class SpringDetector {
    private static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        HashMap<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        print("map = " + map);
       Groundhog gh = ghog.newInstance(3);
       print("Looking up prediction for" + gh);
       if (map.containsKey(gh)) {
           print(map.get(gh));
       } else {
           print("Key not found: " + gh);
       }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }
}
