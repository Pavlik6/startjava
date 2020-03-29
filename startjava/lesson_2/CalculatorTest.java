// Модифицируйте программу Калькулятор:
// реализуйте дополнительный класс CalculatorTest
// для проверки знака математической операции воспользуйтесь оператором switch
// формат ввода математического выражения:
// Введите первое число: 2
// Введите знак математической операции: ^
// Введите второе число: 10
import java.util.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        String answer;
        String yes = "yes";
        String no = "no";

        do {
            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());

            System.out.println("Итог: ");
            calc.resultOfNumbers();

            System.out.println("Хотите продолжить? [yes/no]: ");
            answer = scan.next();

            while (answer != yes || answer != no) {
                System.out.println("Хотите продолжить? [yes/no]: ");
                answer = scan.next();
            }
        } while (answer == yes);
    }
}