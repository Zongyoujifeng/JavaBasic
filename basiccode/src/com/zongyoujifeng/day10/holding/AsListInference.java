package com.zongyoujifeng.day10.holding;

import java.util.*;

/**
 * @author 10451
 * @version 1.0
 * @ClassName AsListInference
 * @description Arrays.asList() makes its best guess about type.
 * @date 2021/2/25 9:42
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder());


        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        Iterator<Snow> snowIterator = snow2.iterator();
        while (snowIterator.hasNext()) {
            System.out.println(snowIterator.next());
        }
        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());


        //Give a hint using an
        //explicit type argument specification:
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy());

        Iterator<Snow> snowIterator1 = snow4.iterator();
        while (snowIterator1.hasNext()) {
            System.out.println(snowIterator1.next());
        }

        List<String> stringA = Arrays.asList("A");
        String[] stringAArray = {"B"};
        List<String> stringB = Arrays.asList(stringAArray);

        System.out.println(stringA);
        System.out.println(stringB);

        int[] intArray = {1, 2, 3, 4, 5};
        // List<Integer> list = Arrays.asList(intArray);
        List<int[]> list = Arrays.asList(intArray);
        System.out.println(list);
    }
}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}





