// Модифицируйте программу Угадай число:
// реализуйте класс GuessNumber, Player и GuessNumberTest
// создайте двух игроков, которые по очереди будут пытаться угадать число, загаданное компьютером
// введите с клавиатуры в начале игры имена каждого игрока
// все объекты, создаваемые в программе, инициализируйте с помощью конструкторов
// для генерации компьютером псевдослучайного числа в диапазоне от 0 до 100 используйте класс Random или Math.random()
package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        String answer;

        do {
            game.play();

            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}