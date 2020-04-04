// Реализуйте Калькулятор, который должен уметь выполнять математические операции 
// (+, -, *, /, ^, %) над целыми положительными числами
package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int num1;
    private int num2;
    private char sign;
    private int result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {

        switch(sign) {
            case '+':
                result = Math.addExact(num1, num2);
                break;
            case '-':
                result = Math.subtractExact(num1, num2);
                break;
            case '*':
                result =  Math.multiplyExact(num1, num2);
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
            case '%':
                result = num1 % num2;
                break;
        }

        return result;
    }
}   