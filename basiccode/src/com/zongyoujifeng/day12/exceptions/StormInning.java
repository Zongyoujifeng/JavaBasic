package com.zongyoujifeng.day12.exceptions;

import java.net.PortUnreachableException;

/**
 * @author 10451
 * @version 1.0
 * @ClassName StormInning
 * @description 异常的限制
 * @date 2021/2/28 16:37
 */
public class StormInning extends Inning implements Storm {
    /**
     * Ok to add new exceptions for constructors, but you must deal with the base constructor exceptions
     *
     * @throws BaseballException
     */
    public StormInning() throws RainedOut, BaseballException {
    }

    public StormInning(String s) throws RainedOut, BaseballException {
    }

    /**
     * Overridden methods can throw inherited exceptions
     */
    @Override
    public void event() {
    }

    @Override
    public void atBat() throws PopFoul {
    }

    @Override
    public void rainHard() throws RainedOut {
    }

    public static void main(String[] args) {
        try {
            StormInning si = new StormInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        }
        catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul ey) {
            System.out.println("Foul");
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }
    }
}

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        //Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } //Throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    /**
     * event
     *
     * @throws RainedOut
     */
    public void event() throws RainedOut, BaseballException;

    /**
     * rainHard
     *
     * @throws RainedOut
     */
    public void rainHard() throws RainedOut;
}

