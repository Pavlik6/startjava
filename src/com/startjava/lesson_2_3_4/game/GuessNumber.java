// GuessNumber — отвечает за сам процесс игры и логику ее работы
package com.startjava.lesson_2_3_4.game;

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

        for (int i = 0; i <= 9; i++) {
            enterNumber(player1);

            if (player1.returnNumber(i) == hiddenNumber) {
                showWinner(player1);
                enteredResult(player1, player2);
                player1.outputNumbers();
                player2.outputNumbers();
                clearNumbers(player1, player2);
                break;
            }

            enterNumber(player2);

            if (player2.returnNumber(i) == hiddenNumber) {
                showWinner(player2);
                enteredResult(player1, player2);
                player1.outputNumbers();
                player2.outputNumbers();
                clearNumbers(player1, player2);
                break;
            }
        }
    }

    //Ввод числа
    private void enterNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scan.nextInt());
    }

    //Показать выйгрышного игрока
    private void showWinner(Player player) {
        System.out.println(player.getName() + " выйграл!!!");
        showAttempts(player);
    }

    //С какой попытки отгадал число игрок
    private void showAttempts(Player player) {
        System.out.println("Игрок " + player.getName()
                + " угадал число " + hiddenNumber
                + " с " + player.getAttempt() + " попытки!");
    }

    //
    private void enteredResult(Player playerOne, Player playerTwo) {
        playerOne.getEneteredNumbers();
        playerTwo.getEneteredNumbers();
    }

    //Очистка введенных чисел
    private void clearNumbers(Player playerOne, Player playerTwo) {
        playerOne.clear();
        playerTwo.clear();
    }

    //Закончились попытки
    private void endAttempt(Player player) {
        System.out.println("У " + player.getName() + "a" + " закончились попытки");
    }
}