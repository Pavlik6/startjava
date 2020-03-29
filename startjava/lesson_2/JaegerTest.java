// Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе,
// как мы это делали в уроке).
// Это позволит на его основе создавать любого робота:
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setHeight(81.77f);
        jaegerOne.setWeight(2000.4f);
        jaegerOne.setSpeed(200);

        jaegerOne.move();
        System.out.println(jaegerOne.call());
        jaegerOne.robotSize();

        System.out.println();

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Saber Athena");
        jaegerTwo.setMark("Mark-7");
        jaegerTwo.setHeight(76.91f);
        jaegerTwo.setWeight(1.628f);
        jaegerTwo.setSpeed(220);

        jaegerTwo.move();
        System.out.println(jaegerTwo.call());
        jaegerTwo.robotSize();
    }
}