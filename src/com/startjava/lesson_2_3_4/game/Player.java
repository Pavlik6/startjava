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
    public void setNumber(int number) {
        enteredNumbers[attempt] = number;
        attempt++;
    }

    //Возвращает массив
    private int[] getEneteredNumbers() {
         int[] numbers = Arrays.copyOf(enteredNumbers, attempt);
         return numbers;
    }

    //Вывод чисел на экран
    public void outputNumbers() {
        System.out.println(Arrays.toString(getEneteredNumbers()));
    }

    //Очистка массива "набора игроками чисел"
    public void clear() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
        attempt = 0;
    }

    //Возвращает кол-во попыток
    public int getAttempt() {
        return attempt;
    }

    //Возврат введенного числа
    public int returnNumber(int i) {
        return enteredNumbers[i];
    }
}