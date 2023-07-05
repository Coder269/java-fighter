package com.wcs.coursjava.entity;

import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

abstract class Perso {
    private String name;
    private int pv;

    Perso(String name, int pv) throws InvalidPVException, EmptyNameException {
        this.name = name;
        this.pv = pv;
        if (this.pv < 1) {
            throw new InvalidPVException();
        }

    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getPv() {
        return this.pv;
    }

    protected void setPv(int pv) {
        this.pv = pv;
    }
}
