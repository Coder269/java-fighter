package com.wcs.coursjava;

import com.wcs.coursjava.entity.*;
import com.wcs.coursjava.exception.EmptyNameException;
import com.wcs.coursjava.exception.InvalidPVException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1, choose a name: ");
        String playerOneName = sc.nextLine();
        System.out.println(playerOneName + ", choose a character 1)Warrior 2)Mage");
        Player playerOne;
        int select = sc.nextInt();
        switch (select) {
            case 1:
                playerOne = new Guerrier(playerOneName, 80);
                break;
            case 2:
                playerOne = new Magicien(playerOneName, 60);
                break;
            default:
                playerOne = new Guerrier(playerOneName, 80);

        }
        System.out.println("Player 2, you play as a goblin, choose a name:");
        sc.nextLine();
        String playerTwoName = sc.nextLine();
        Goblin playerTwo = new Goblin(playerTwoName, 60);

        while (playerOne.getPv() > 0 && playerTwo.getPv() > 0) {
            // Player One's turn
            System.out.println( playerOne.getName() + "'s turn ...");
            if (playerOne.getClass() == Guerrier.class)
                System.out.println("Choose an attack 1)Sword 2)Spear 3)Ax");
            else
                System.out.println("Choose an attack 1)Fireball 2)Ice 3)Tornado");

            int selectAttack = sc.nextInt();
            switch (selectAttack) {
                case 1:
                    int attackOne = ((Attaque) playerOne).attaque1(15);
                    playerTwo.getDamage(attackOne);
                    break;
                case 2:
                    int attackTwo = ((Attaque) playerOne).attaque2(17);
                    playerTwo.getDamage(attackTwo);
                    break;
                case 3:
                    int attackThree = ((Attaque) playerOne).attaque3(13);
                    playerTwo.getDamage(attackThree);
                    break;
            }
            System.out.println( playerTwo.getName() + "'s health is: " + playerTwo.getPv());
            if (playerTwo.getPv() <= 0) break;

            // Player two's turn
            System.out.println( playerTwo.getName() +"'s turn ...");
            System.out.println("Choose an attack 1)Dagger 2)Hand 3)Small sword");
            selectAttack = sc.nextInt();
            switch (selectAttack) {
                case 1:
                    int attackOne = ((Attaque) playerTwo).attaque1(12);
                    playerOne.getDamage(attackOne);
                    break;
                case 2:
                    int attackTwo = ((Attaque) playerTwo).attaque2(14);
                    playerOne.getDamage(attackTwo);
                    break;
                case 3:
                    int attackThree = ((Attaque) playerTwo).attaque3(15);
                    playerOne.getDamage(attackThree);
                    break;
            }
            System.out.println(playerOne.getName() + "'s health is: " + playerOne.getPv());

        }
        sc.close();
        if (playerOne.getPv() <= 0)
            System.out.println(playerTwo.getName() + " has won, Game Over!");
        else if (playerTwo.getPv() <= 0)
            System.out.println(playerOne.getName() + " has won, Game Over!");
    }

}



