package com.zongyoujifeng.day08.innerclass;

import com.zongyoujifeng.day08.innerclass.Controller.Event;
import com.zongyoujifeng.day08.innerclass.Controller.GreenhouseControls;

/**
 * @author 10451
 * @version 1.0
 * @ClassName GreenHouseController
 * @description 命令设计模式
 * @date 2021/2/18 22:35
 */
public class GreenHouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        //Instead of hard-wiring,you can parse
        //configuration information from a text file here
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])
                    )
            );
            gc.run();
        }
    }
}
