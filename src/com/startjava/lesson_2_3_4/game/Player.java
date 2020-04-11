// Player — описывает игроков (один экземпляр класса соответствует одному игроку)
package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Добавление числа в массив
    public void addNumberToArrayNumbers(int count, int number) {
        enteredNumbers[count] = number;
        attempt = count;
    }

    //Вывод результата
    public void getEneteredNumbers() {
        int[] numbers = Arrays.copyOf(enteredNumbers, attempt + 1);
        System.out.println(Arrays.toString(numbers));
    }

    //Очистка массива "набора игроками чисел"
    public void clear(int count) {
        Arrays.fill(enteredNumbers, 0, count, 0);
    }

    //Возвращает кол-во попыток
    public int resultAttempt() {
        return attempt + 1;
    }
}