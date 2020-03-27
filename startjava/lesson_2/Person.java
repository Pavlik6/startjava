// Создайте класс Person (без метода main)
// Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
// Проинициализируйте их какими-то значениями
// Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
public class Person {
    String gender = "Man";
    String name = "Bob";
    float height = 1.86f;
    int weigth = 84;
    int age = 30;

    void walk() {
        System.out.println("I'm walking");
    }

    void sit() {
        System.out.println("I'm sitting");
    }

    void run() {
        System.out.println("I'm running");
    }

    String speak() {
        return ("I'm " + age + " years old.");
    }

    void learnJava() {
        System.out.println("I'am learning Java");
    }
}