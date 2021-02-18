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

}
