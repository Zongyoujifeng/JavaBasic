package com.zongyoujifeng.day08.innerclass.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Controller
 * @description The reusable framework for control systems.
 * @date 2021/2/18 21:34
 */
public class Controller {
    //A class for java.util to hold Event Objects

    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            //Make a copy so you're not modifying the list
            //while you're selecting the elements in it
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

}
