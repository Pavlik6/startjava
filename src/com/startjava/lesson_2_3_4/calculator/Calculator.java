// Реализуйте Калькулятор, который должен уметь выполнять математические операции 
// (+, -, *, /, ^, %) над целыми положительными числами
package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch(this.sign) {
            case '+':
                System.out.println(this.num1 + " + " + this.num2 + " = " + (this.num1 + this.num2));
                break;
            case '-':
                System.out.println(this.num1 + " - " + this.num2 + " = " + (this.num1 - this.num2));
                break;
            case '*':
                System.out.println(this.num1 + " * " + this.num2 + " = " + (this.num1 * this.num2));
                break;
            case '/':
                System.out.println(this.num1 + " / " + this.num2 + " = " + (this.num1 / this.num2));
                break;
            case '^':
                int result = (int)Math.pow(this.num1, this.num2);
                System.out.println(this.num1 + " ^ " + this.num2 + " = " + result);
                break;
            case '%':
                System.out.println(this.num1 + " % " + this.num2 + " = " + (this.num1 % this.num2));
                break;
        }
    }
}   