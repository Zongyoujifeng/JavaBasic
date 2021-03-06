package com.zongyoujifeng.day13.generic;

import java.util.List;

/**
 * @author 10451
 * @version 1.0
 * @ClassName EpicBattle
 * @description 更多层次的示例
 * @date 2021/3/6 16:48
 */
public class EpicBattle {
    static <POWER extends SuperHearing>
    void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        List<? extends SuperHearing> audioBoys;
    }
}

interface SuperPower {
}

interface XRayVision extends SuperPower {
    void seeThroughWalls();
}

interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}

interface SuperSmell extends SuperPower {
    void trackBySmell();
}

class SuperHero<POWER extends SuperPower> {
    POWER power;

    public SuperHero(POWER power) {
        this.power = power;
    }

    public POWER getPower() {
        return power;
    }
}

class SuperSleuth<POWER extends XRayVision> extends
        SuperHero<POWER> {
    public SuperSleuth(POWER power) {
        super(power);
    }

    void see() {
        power.seeThroughWalls();
    }
}

class CanineHero<POWER extends SuperHearing & SuperSmell>
        extends SuperHero<POWER> {
    public CanineHero(POWER power) {
        super(power);
    }

    void hear() {
        power.hearSubtleNoises();
    }

    void smell() {
        power.trackBySmell();
    }
}

class SuperHearSmell implements SuperHearing, SuperSmell {
    @Override
    public void hearSubtleNoises() {
    }

    @Override
    public void trackBySmell() {
    }
}

class DogBoy extends CanineHero<SuperHearSmell> {
    public DogBoy() {
        super(new SuperHearSmell());
    }
}