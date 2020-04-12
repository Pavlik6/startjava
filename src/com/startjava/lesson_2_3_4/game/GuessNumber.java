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

            if (player1.getNumber(i) == hiddenNumber) {
                showWinner(player1);
                showNumbers();
                break;
            }
            endAttempt(player1);

            enterNumber(player2);

            if (player2.getNumber(i) == hiddenNumber) {
                showWinner(player2);
                showNumbers();
                break;
            }
            endAttempt(player2);
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
        System.out.println("Игрок " + player.getName()
                + " угадал число " + hiddenNumber
                + " с " + player.getAttempt() + " попытки!");
    }

    //Вывод на экран набор введенных чисел каждым игроком
    private void showNumbers() {
        outputNumbers(player1);
        outputNumbers(player2);
        clearNumbers();
    }

    //Вывод чисел на экран
    private void outputNumbers(Player player) {
        System.out.println(Arrays.toString(player.getEneteredNumbers()));
    }

    //Очистка введенных чисел
    private void clearNumbers() {
        player1.clear();
        player2.clear();
    }

    //Закончились попытки
    private void endAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + "a" + " закончились попытки");
        }
    }
}