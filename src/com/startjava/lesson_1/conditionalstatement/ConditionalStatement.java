package com.startjava.lesson_1.conditionalstatement;

class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("You are welcome!");
        }

        boolean isMan = true;
        if(isMan) {
            System.out.println("You are a man!");
        }

        if(!isMan) {
            System.out.println("You aren't a man");
        }

        float height = 1.86f;
        if(height < 1.80) {
            System.out.println("You are small");
        } else {
            System.out.println("You are very height");
        }

        char firstLetterOfName = 'M';
        if(firstLetterOfName == 'M') {
            System.out.println("Your name is Max");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Your name is Inna");
        } else {
            System.out.println("Who are you?");
        }
    }
}