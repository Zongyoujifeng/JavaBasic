package com.zongyoujifeng.day05.interfaces.music;

import com.zongyoujifeng.day05.polymorphism.music3.Note;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Music4
 * @description
 * @date 2021/1/19 11:31
 */
public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

class Wind extends Instrument {

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument {
    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }

}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    public void adjust() {

    }
}

class Woodwind extends Wind {
    @Override
    public String what() {
        return "Woodwind";
    }

    @Override
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }
}