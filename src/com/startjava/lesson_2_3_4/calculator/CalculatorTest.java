// Модифицируйте программу Калькулятор:
// реализуйте дополнительный класс CalculatorTest
// для проверки знака математической операции воспользуйтесь оператором switch
// формат ввода математического выражения:
// Введите первое число: 2
// Введите знак математической операции: ^
// Введите второе число: 10
package com.startjava.lesson_2_3_4.calculator;

import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        String answer;
        String[] mathExpression = new String[3];

        do {
            System.out.print("Введите математическое выражение: ");

            for (int i = 0; i < mathExpression.length; i++) {
                mathExpression[i] = scan.next();
            }

            calc.setNum1(Integer.parseInt(mathExpression[0]));
            calc.setSign(mathExpression[1].charAt(0));
            calc.setNum2(Integer.parseInt(mathExpression[2]));

            System.out.println("Вывод: " + mathExpression[0] + " "
                                         + mathExpression[1] + " "
                                         + mathExpression[2] + " = "
                                         + calc.calculate());

            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));

        } while (answer.equals("yes"));
    }
}