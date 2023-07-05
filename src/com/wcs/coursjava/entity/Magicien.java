package com.wcs.coursjava.entity;

public class Magicien extends Player implements Attaque {

    public Magicien(String name, int pv) throws Exception {
        super(name, pv);
    }


    @Override
    public int attaque1() {
        System.out.println(getName() + " has launched a fireball");
        return 16;
    }

    @Override
    public int attaque2() {
        System.out.println(getName() + " has launched an ice attack");
        return 15;
    }

    @Override
    public int attaque3() {
        System.out.println(getName() + " has launched a tornado");
        return 13;
    }
}
