// Создайте класс Wolf
// напишите в нем поля: пол, кличка, вес, возраст, окрас
// напишите в нем методы: идти, сидеть, бежать, выть, охотиться
// Создайте класс WolfTest с методом main
// создайте объект типа Wolf
// присвойте в нем полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей и отобразите в консоли
// вызовите методы объекта
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Man";
        wolfOne.nickname = "Alex";
        wolfOne.weight = 120;
        wolfOne.age = 20;
        wolfOne.color = "gray";

        System.out.println("Gender - " + wolfOne.gender);
        System.out.println("Nickname - " + wolfOne.nickname);
        System.out.println("Weight - " + wolfOne.weight);
        System.out.println("Age - " + wolfOne.age);
        System.out.println("Color - " + wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}