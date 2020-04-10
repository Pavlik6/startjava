// GuessNumber — отвечает за сам процесс игры и логику ее работы
package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int count;

    Random random = new Random();
    private int hiddenNumber;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    //Ввод числа и добавление его в массив
    public void enterNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scan.nextInt());
        player.addNumberToArrayNumbers(count);
    }

    //С какой попытки отгадал число игрок
    public void showAttempts(Player player) {
        System.out.println("Игрок " + player.getName()
                + " угадал число " + hiddenNumber
                + " с " + count + " попытки!");
    }

    //Закончились попытки
    public void endAttempt(Player player) {
        System.out.println("У " + player.getName() + "a" + " закончились попытки");
    }

    public void play() {
        hiddenNumber = random.nextInt(101);
        System.out.println(hiddenNumber);
        count = 1;

        do {
            enterNumber(player1);

            if(player1.getNumber() == hiddenNumber) {
                System.out.println(player1.getName() + " выйграл!!!");
                showAttempts(player1);
                player1.getEneteredNumbers(count);
                player2.getEneteredNumbers(count - 1);
                player1.clear(count);
                player2.clear(count);
                break;
            }

            enterNumber(player2);

            if(player2.getNumber() == hiddenNumber) {
                System.out.println(player2.getName() + " выйграл!!!");
                showAttempts(player2);
                player1.getEneteredNumbers(count);
                player2.getEneteredNumbers(count);
                player1.clear(count);
                player2.clear(count);
                break;
            }

            count++;
        } while (true && count <= 10);

        if(count > 10) {
            endAttempt(player1);
            endAttempt(player2);
        }
    }
}