// Создайте класс Wolf
// напишите в нем поля: пол, кличка, вес, возраст, окрас
// напишите в нем методы: идти, сидеть, бежать, выть, охотиться
// Создайте класс WolfTest с методом main
// создайте объект типа Wolf
// присвойте в нем полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей и отобразите в консоли
// вызовите методы объекта
// ================================================
// Модифицируйте класс WolfTest
// с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей с помощью геттеров и отобразите в консоли
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Man");
        wolfOne.setNickname("Alex");
        wolfOne.setWeight(120);
        wolfOne.setAge(20);
        wolfOne.setColor("Gray");

        System.out.println("Gender - " + wolfOne.getGender());
        System.out.println("Nickname - " + wolfOne.getNickname());
        System.out.println("Weight - " + wolfOne.getWeight());
        System.out.println("Age - " + wolfOne.getAge());
        System.out.println("Color - " + wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}