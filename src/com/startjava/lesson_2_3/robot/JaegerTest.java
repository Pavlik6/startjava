// Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе,
// как мы это делали в уроке).
// Это позволит на его основе создавать любого робота:
package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Avenger", "Mark-6", 81.77f, 2000.4f, 200);

        jaegerOne.move();
        System.out.println(jaegerOne.call());
        jaegerOne.robotSize();

        System.out.println();

        Jaeger jaegerTwo = new Jaeger("Saber Athena", "Mark-7", 76.91f, 1.628f, 220);
        
        jaegerTwo.move();
        System.out.println(jaegerTwo.call());
        jaegerTwo.robotSize();
    }
}