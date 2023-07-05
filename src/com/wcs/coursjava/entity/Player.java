package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public abstract class Player extends Perso {
    public Player(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }

    public void getDamage(int damage) {
        this.setPv(this.getPv() - damage);
    }

}
