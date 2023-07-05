package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

public abstract class Monster extends Player{

    public Monster(String name, int pv) throws InvalidPVException, EmptyNameException {
        super(name, pv);
    }


}

