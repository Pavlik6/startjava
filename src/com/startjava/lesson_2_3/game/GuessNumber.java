// GuessNumber — отвечает за сам процесс игры и логику ее работы
package com.startjava.lesson_2_3.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;

    Random random = new Random();
    private int hiddenNumber;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        hiddenNumber = random.nextInt(101);
        System.out.println(hiddenNumber);

        do {
            System.out.print(player1.getName() + " введите число: ");
            player1.setNumber(scan.nextInt());
            if(player1.getNumber() == hiddenNumber) {
                System.out.println(player1.getName() + " выйграл!!!");
                break;
            }

            System.out.print(player2.getName() + " введите число: ");
            player2.setNumber(scan.nextInt());
            if(player2.getNumber() == hiddenNumber) {
                System.out.println(player2.getName() + " выйграл!!!");
                break;
            }
        } while (true);
    }
}