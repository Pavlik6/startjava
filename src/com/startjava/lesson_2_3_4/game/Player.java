// Player — описывает игроков (один экземпляр класса соответствует одному игроку)
package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //Добавление числа в массив
    public void addNumberToArrayNumbers(int count, int number) {
        enteredNumbers[count] = number;
    }

    //Вывод результата
    public void getEneteredNumbers(int count) {
        System.out.print(getName() + ": ");
        int[] numbers = Arrays.copyOf(enteredNumbers, count);
        System.out.println(Arrays.toString(numbers));
    }

    //Очистка массива "набора игроками чисел"
    public void clear(int num) {
        Arrays.fill(enteredNumbers, 0, num, 0);
    }
}