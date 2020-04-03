package com.startjava.lesson_1.cycle;

class Cycle {
    public static void main(String[] args) {
        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        //Выведите на консоль с помощью цикла while 
        //все числа от [6, -6] (шаг итерации равен 2)
        int i = 6;
        while(i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        //Подсчитайте с помощью цикла do-while сумму нечетных чисел
        // от [10, 20], и выведите ее на консоль
        int sumOdd = 0;
        int j = 10;
        do {
            if(j % 2 != 0) {
                sumOdd += j;
            }
            j++;
        } while(j <= 20);

        System.out.println(sumOdd);
    }
}