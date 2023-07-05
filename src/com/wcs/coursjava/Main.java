package com.wcs.coursjava;

import com.wcs.coursjava.entity.*;
import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Player 1 setup
        System.out.println("Player 1, choose a name: ");
        String playerOneName = sc.next();
        Player playerOne = classSelector(playerOneName);


        //Player 2 setup
        System.out.println("Player 2, choose a name:");
        String playerTwoName = sc.next();
        Player playerTwo = classSelector(playerTwoName);


        //Main loop
        while (playerOne.getPv() > 0 && playerTwo.getPv() > 0) {
            // Player One's turn
            System.out.println(playerOne.getName() + "'s turn ...");

            attack(playerOne, playerTwo);

            if (playerTwo.getPv() <= 0) break;

            // Player two's turn
            System.out.println(playerTwo.getName() + "'s turn ...");

            attack(playerTwo, playerOne);
        }

        if (playerOne.getPv() <= 0)
            System.out.println(playerTwo.getName() + " has won, Game Over!");
        else if (playerTwo.getPv() <= 0)
            System.out.println(playerOne.getName() + " has won, Game Over!");
        sc.close();
    }


    public static Player classSelector(String name) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " ,choose a character:" +
                "\n 1)Warrior 2)Mage 3)Goblin" +
                "\n =>");
        int select = 0;
        try {
            select = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please choose a number between 1, 2, or 3");
            return classSelector(name);
        }
        switch (select) {
            case 1:
                return new Guerrier(name, 80);

            case 2:
                return new Magicien(name, 60);

            case 3:
                return new Goblin(name, 50);

            default:
                return new Guerrier(name, 80);
        }
    }

    public static void attack(Player player, Player target) {
        Scanner sc = new Scanner(System.in);
        int selectAttack = 0;
        if (player.getClass() == Guerrier.class)
            System.out.println("Choose an attack: 1)Sword 2)Spear 3)Ax");
        else if (player.getClass() == Magicien.class)
            System.out.println("Choose an attack 1)Fireball 2)Ice 3)Tornado");
        else if (player.getClass() == Goblin.class)
            System.out.println("Choose an attack: 1)Dagger 2)Hand 3)Small Sword");

        try {
            selectAttack = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Please choose a number between 1, 2, or 3");
            attack(player, target);
            return;
        }
        switch (selectAttack) {
            case 1:
                int attackOne = ((Attaque) player).attaque1();
                target.getDamage(attackOne);
                break;
            case 2:
                int attackTwo = ((Attaque) player).attaque2();
                target.getDamage(attackTwo);
                break;
            case 3:
                int attackThree = ((Attaque) player).attaque3();
                target.getDamage(attackThree);
                break;
        }
        System.out.println(target.getName() + "'s health is: " + target.getPv());

    }
}



