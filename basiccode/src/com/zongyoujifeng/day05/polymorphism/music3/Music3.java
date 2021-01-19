package com.zongyoujifeng.day05.polymorphism.music3;

import com.zongyoujifeng.day04.polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Music3
 * @description 多态
 * @date 2021/1/19 8:59
 */
public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e
        ) {
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

class Instrument {
    public void play(Note n) {
        print("Instrument.play()" + n);
    }

    String what() {
        return "Instrument:";
    }

    void adjust() {
        print("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play()" + n);
    }

    @Override
    String what() {
        return "Wind:";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        print("Stringed.play()" + n);
    }

    @Override
    String what() {
        return "Stringed:";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        print("Percussion.play()" + n);
    }

    @Override
    String what() {
        return "Percussion:";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note n) {
        print("Brass.play()" + n);
    }

    @Override
    String what() {
        return "Brass:";
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Instrument {
    @Override
    public void play(Note n) {
        print("Woodwind.play()" + n);
    }

    @Override
    String what() {
        return "Woodwind:";
    }

    @Override
    void adjust() {
        print("Adjusting Woodwind");
    }
}