package com.zongyoujifeng.day14.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName LatentReflection
 * @description Using Reflection to produce latent typing
 * @date 2021/3/10 10:15
 */
public class LatentReflection {
    public static void main(String[] args) {
        CommunicateReflectively.perform(new SmartDog());
        CommunicateReflectively.perform(new Mime());
    }
}

class Mime {
    public void walkAgainstTheWind() {
    }

    public void sit() {
        print("Pretending to sit");
    }

    public void reproduce() {
    }

    @Override
    public String toString() {
        return "Mime ";
    }
}

class SmartDog {
    public void speak() {
        print("Woof");
    }

    public void sit() {
        print("Sitting");
    }

    public void reproduce() {
    }
}

class CommunicateReflectively {
    public static void perform(Object speaker) {
        Class<?> spkr = speaker.getClass();
        try {
            try {
                Method speak = spkr.getMethod("speak");
                speak.invoke(speaker);
            } catch (NoSuchMethodException e) {
                print(speaker + "cannot speak");
            }

            try {
                Method sit = spkr.getMethod("sit");
                sit.invoke(speaker);
            } catch (NoSuchMethodException e) {
                print(speaker + "cannot sit");
            }
        } catch (Exception e) {
            throw new RuntimeException(speaker.toString(), e);
        }

    }
}
