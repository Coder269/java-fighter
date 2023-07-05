package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public class Goblin extends Monster implements Attaque {
    public Goblin(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    @Override
    public int attaque1() {
        System.out.println(getName() + " is attacking with a dagger");
        return 13;
    }

    @Override
    public int attaque2() {
        System.out.println(getName() + " is attacking with hands");
        return 14;
    }

    @Override
    public int attaque3() {
        System.out.println(getName() + " is attacking with a small Sword");
        return 15;
    }


}
