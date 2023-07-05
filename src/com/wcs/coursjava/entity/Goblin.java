package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public class Goblin extends Monster implements Attaque {
    public Goblin(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    @Override
    public int attaque1(int damage) {
        System.out.println(getName() + " is attacking with a dagger");
        return damage;
    }

    @Override
    public int attaque2(int damage) {
        System.out.println(getName() + " is attacking with hands");
        return damage;
    }

    @Override
    public int attaque3(int damage) {
        System.out.println(getName() + " is attacking with a small Sword");
        return damage;
    }


}
