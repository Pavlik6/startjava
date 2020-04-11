// GuessNumber — отвечает за сам процесс игры и логику ее работы
package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int count;
    private int number;

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
        count = 0;

        do {
            enterNumber(player1);

            if (number == hiddenNumber) {
                playerWin(player1);
                enteredResultAndClear(player1, player2);
                break;
            }

            enterNumber(player2);

            if (number == hiddenNumber) {
                playerWin(player2);
                enteredResultAndClear(player1, player2);
                break;
            }

            count++;
        } while (count <= 9);

        if (count > 9) {
            endAttempt(player1);
            endAttempt(player2);
        }
    }

    //Ввод числа и добавление его в массив
    private void enterNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        number = scan.nextInt();
        player.addNumberToArrayNumbers(count, number);
    }

    private void playerWin(Player player) {
        System.out.println(player.getName() + " выйграл!!!");
        showAttempts(player);
    }

    //С какой попытки отгадал число игрок
    private void showAttempts(Player player) {
        System.out.println("Игрок " + player.getName()
                + " угадал число " + hiddenNumber
                + " с " + player.resultAttempt() + " попытки!");
    }

    //Вывод результата и очистка всех введенных чисел
    private void enteredResultAndClear(Player playerOne, Player playerTwo) {
        playerOne.getEneteredNumbers();
        playerTwo.getEneteredNumbers();
        playerOne.clear(count);
        playerTwo.clear(count);
    }

    //Закончились попытки
    private void endAttempt(Player player) {
        System.out.println("У " + player.getName() + "a" + " закончились попытки");
    }
}