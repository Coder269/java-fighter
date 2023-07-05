package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public class Guerrier extends Player implements Attaque {
    public Guerrier(String name) throws InvalidPVException, EmptyNameException {
        super(name, 50);
    }

    public Guerrier(String name, int pv) throws  InvalidPVException, EmptyNameException {
        super(name, pv);
    }


    @Override
    public int attaque1(int damage) {
        System.out.println(getName() + " is attacking with a Sword");
        return damage;
    }

    @Override
    public int attaque2(int damage) {
        System.out.println(getName() + " is attacking with a spear");
        return damage;
    }

    @Override
    public int attaque3(int damage) {
        System.out.println(getName() + " is attacking with an ax");
        return damage;
    }

}
