package com.wcs.coursjava.entity;

public class Magicien extends Player implements Attaque {

    public Magicien(String name, int pv) throws Exception {
        super(name, pv);
    }


    @Override
    public int attaque1(int damage) {
        System.out.println(getName() + " has launched a fireball");
        return damage;
    }

    @Override
    public int attaque2(int damage) {
        System.out.println(getName() + " has launched an ice attack");
        return damage;
    }

    @Override
    public int attaque3(int damage) {
        System.out.println(getName() + " has launched a tornado");
        return damage;
    }
}
