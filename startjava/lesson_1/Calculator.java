// Реализуйте Калькулятор, который должен уметь выполнять математические операции 
// (+, -, *, /, ^, %) над целыми положительными числами
class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        char sign = '^';

        if(sign == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if(sign == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if(sign == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if(sign == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else if(sign == '^') {
            int result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(num1 + " ^ " + num2 + " = " + result);
        } else if(sign == '%') {
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
    }
}